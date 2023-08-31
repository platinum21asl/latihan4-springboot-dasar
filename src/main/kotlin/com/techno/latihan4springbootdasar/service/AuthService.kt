package com.techno.latihan4springbootdasar.service

import com.techno.latihan4springbootdasar.domain.dto.request.ReqAuthUsersDto
import com.techno.latihan4springbootdasar.domain.dto.response.ResBaseDto

interface AuthService {

    fun authLogin(reqAuthUsersDto: ReqAuthUsersDto): ResBaseDto<Any>
    fun validateToken(auth: String): Boolean
}