package com.techno.latihan4springbootdasar.domain.dto.request

import javax.validation.constraints.NotBlank

data class ReqAuthUsersDto(
    @field:NotBlank(message = "field username cannot be blank")
    val username: String? = null,

    @field:NotBlank(message = "field username cannot be blank")
    val password: String? = null,
)
