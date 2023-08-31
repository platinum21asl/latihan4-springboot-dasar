package com.techno.latihan4springbootdasar.domain.dto.response

data class ResBaseDto<T>(

    val status : Boolean = true,
    val message : String = "Success",
    val data : T? = null,
    val code: Int = 200,
    val error: T? = null

)
