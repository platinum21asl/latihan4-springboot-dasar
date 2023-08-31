package com.techno.latihan4springbootdasar.domain.dto.request

import javax.validation.constraints.NotBlank

data class ReqDocumentCategoryDto(

    @field:NotBlank(message = "field name cannot be blank")
    val name: String? = null,
)
