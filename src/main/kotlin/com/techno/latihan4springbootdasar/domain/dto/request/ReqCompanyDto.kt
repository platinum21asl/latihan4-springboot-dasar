package com.techno.latihan4springbootdasar.domain.dto.request

import javax.validation.constraints.NotBlank

data class ReqCompanyDto(

    @field:NotBlank(message = "field name cannot be blank")
    val name: String,

    @field:NotBlank(message = "field address cannot be blank")
    val address: String? = null,

    @field:NotBlank(message = "field email cannot be blank")
    val email: String,

    @field:NotBlank(message = "field telephone cannot be blank")
    val telephone: String? = null,
)
