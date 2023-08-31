package com.techno.latihan4springbootdasar.domain.dto.response

import java.time.LocalDateTime

data class ResCompanyDto(

    val id: Int,
    val uid: String,
    val name: String,
    val address: String,
    val email: String,
    val telephone: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
)
