package com.techno.latihan4springbootdasar.service.impl


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import com.techno.latihan4springbootdasar.domain.dto.request.ReqAuthUsersDto
import com.techno.latihan4springbootdasar.domain.dto.response.ResAuthUsersDto
import com.techno.latihan4springbootdasar.domain.dto.response.ResBaseDto
import com.techno.latihan4springbootdasar.domain.entity.EntityToken
import com.techno.latihan4springbootdasar.exception.CustomExceptionHandler
import com.techno.latihan4springbootdasar.repository.RepositoryToken
import com.techno.latihan4springbootdasar.repository.RepositoryUsers
import com.techno.latihan4springbootdasar.service.AuthService
import com.techno.latihan4springbootdasar.util.JwtGenerator
import org.springframework.stereotype.Service
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter


@Service
class AuthServiceImpl(

    private val repositoryUsers: RepositoryUsers,
    private val repositoryToken: RepositoryToken
) : AuthService {

    override fun authLogin(reqAuthUsersDto: ReqAuthUsersDto): ResBaseDto<Any> {
        val dataUser = repositoryUsers.findByUsername(reqAuthUsersDto.username.toString())
            ?: throw CustomExceptionHandler("Username Not Found")

        val bcryptEncoder = BCryptPasswordEncoder()
        val isPasswordMatch = bcryptEncoder.matches(reqAuthUsersDto.password, dataUser.password)
        if (!isPasswordMatch) {
            throw CustomExceptionHandler("Password is Invalid")
        }

//        Algorithm untuk enkripsi id dan Username
        var expiredJwt = System.currentTimeMillis() + 600000L
        val expiredDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(expiredJwt), ZoneId.systemDefault())
        val token = JwtGenerator().createJwt(
            dataUser.id.toString(),
            reqAuthUsersDto.username!!,
            expiredJwt
        )
        val data = EntityToken(
            token = token,
            expired = expiredDate,
            idUser = dataUser
        )
        val insertEntityToken = repositoryToken.save(data)

        val response = ResAuthUsersDto(
            id = insertEntityToken.id,
            token = insertEntityToken.token
        )

        return ResBaseDto(data = response)

    }

    override fun validateToken(auth: String): Boolean {
        val data = repositoryToken.findIdByToken(auth) ?: throw CustomExceptionHandler("Token not valid")
        val dateTimeString = data.expired.toString()
        val dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS")
        val dateTime = LocalDateTime.parse(dateTimeString, dateTimeFormatter)
        val currentTime = LocalDateTime.now()
        if (currentTime.isAfter(dateTime)) {
            throw CustomExceptionHandler("Waktu token telah habis")
        }
        return true
    }
}