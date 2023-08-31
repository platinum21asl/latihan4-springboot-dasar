package com.techno.latihan4springbootdasar.domain.dto.response

import java.time.LocalDateTime

data class ResDocumentDto(

    val id: Int,
    val uid: String,
    val nameCompany: String,
    val nameCategory: String,
    val name: String,
    val description: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime

)
