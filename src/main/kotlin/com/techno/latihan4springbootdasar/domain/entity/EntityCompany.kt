package com.techno.latihan4springbootdasar.domain.entity

import java.time.LocalDateTime
import javax.persistence.*


@Entity
@Table(name = "company")
data class EntityCompany(


    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    @field:Column(name = "id", columnDefinition = "bigint")
    val id: Int? = null,

    @field:Column(name = "uid", columnDefinition = "varchar(255)")
    val uid: String? = null,

    @field:Column(name = "name", columnDefinition = "varchar(255)")
    val name: String? = null,

    @field:Column(name = "address", columnDefinition = "varchar(255)")
    val address: String? = null,

    @field:Column(name = "email", columnDefinition = "varchar(255)")
    val email: String? = null,

    @field:Column(name = "telephone", columnDefinition = "varchar(255)")
    val telephone: String? = null,

    @field:Column(name = "createdAt", columnDefinition = "timestamp")
    val createdAt: LocalDateTime? = null,

    @field:Column(name = "updatedAt", columnDefinition = "timestamp")
    val updatedAt: LocalDateTime? = null
)
