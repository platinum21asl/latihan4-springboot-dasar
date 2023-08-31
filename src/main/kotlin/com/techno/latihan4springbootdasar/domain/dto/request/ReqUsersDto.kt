package com.techno.latihan4springbootdasar.domain.dto.request

import com.techno.latihan4springbootdasar.domain.validation.UniqueValidation
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class ReqUsersDto(

    @field:NotNull(message = "field idCompany cannot be null")
    val idCompany: Int,

    @field:NotNull(message = "field idCategory cannot be null")
    val idPosition: Int,

    @field:NotBlank(message = "field name cannot be blank")
    val name: String,

    @field:NotBlank(message = "field address cannot be blank")
    val address: String? = null,

    @field:NotBlank(message = "field email cannot be blank")
    @field:UniqueValidation(message = "field email must be unique")
    val email: String,

    @field:NotBlank(message = "field telephone cannot be blank")
    val telephone: String? = null,

    @field:NotBlank(message = "field username cannot be blank")
    @field:UniqueValidation(message = "field username must be unique")
    val username: String,

    @field:NotBlank(message = "field password cannot be blank")
    @field:Size(max = 32, message = "Maximum length is 32 characters")
    val password: String,

    @field:NotBlank(message = "field role cannot be blank")
    val role: String? = null,
)
