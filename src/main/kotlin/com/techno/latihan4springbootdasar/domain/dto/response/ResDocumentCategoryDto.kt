package com.techno.latihan4springbootdasar.domain.dto.response

import java.time.LocalDateTime

data class ResDocumentCategoryDto(

    val id: Int,
    val uid: String,
    val name: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
)
