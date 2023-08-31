package com.techno.latihan4springbootdasar.domain.dto.request

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class ReqDocumentDto(


    @field:NotNull(message = "field idCompany cannot be null")
    val idCompany: Int,

    @field:NotNull(message = "field idCategory cannot be null")
    val idCategory: Int,

    @field:NotBlank(message = "field name cannot be blank")
    val name: String,

    @field:NotBlank(message = "field address cannot be blank")
    val description: String? = null,
)
