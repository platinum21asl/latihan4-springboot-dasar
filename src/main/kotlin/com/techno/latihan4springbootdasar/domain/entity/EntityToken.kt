package com.techno.latihan4springbootdasar.domain.entity

import java.time.LocalDateTime
import javax.persistence.*


@Entity
@Table(name = "token")
data class EntityToken(
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    @field:Column(name = "id", columnDefinition = "bigint")
    val id: Int? = null,

    @field:Column(name = "token", columnDefinition = "varchar(255)")
    val token: String? = null,

    @field:Column(name = "expired", columnDefinition = "timestamp")
    val expired: LocalDateTime? = null,

    @OneToOne
    @field:JoinColumn(name = "idUser", referencedColumnName = "id", columnDefinition = "bigint")
    val idUser: EntityUsers? = null,
)
