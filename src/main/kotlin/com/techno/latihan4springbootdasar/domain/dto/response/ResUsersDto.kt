package com.techno.latihan4springbootdasar.domain.dto.response

import java.time.LocalDateTime

data class ResUsersDto(

    val id: Int,
    val uid: String,
    val nameCompany: String,
    val namePosition: String,
    val name: String,
    val address: String,
    val email: String,
    val telephone: String,
    val username: String,
    val role: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime


)
