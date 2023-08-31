package com.techno.latihan4springbootdasar.controller

import com.techno.latihan4springbootdasar.domain.dto.request.ReqAuthUsersDto
import com.techno.latihan4springbootdasar.domain.dto.response.ResAuthUsersDto
import com.techno.latihan4springbootdasar.domain.dto.response.ResBaseDto
import com.techno.latihan4springbootdasar.service.AuthService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid


@RestController
@RequestMapping("/api/auth")
class AuthController(
    private val authService: AuthService
) {

    @PostMapping("/login")
    fun login(@Valid @RequestBody reqAuthUsersDto: ReqAuthUsersDto): ResponseEntity<ResBaseDto<Any>> {
        val result = authService.authLogin(reqAuthUsersDto)

        return ResponseEntity.ok().body(result)
    }

}