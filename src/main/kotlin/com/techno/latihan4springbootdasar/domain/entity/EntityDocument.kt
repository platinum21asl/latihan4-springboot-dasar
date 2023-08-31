package com.techno.latihan4springbootdasar.domain.entity

import java.time.LocalDateTime
import javax.persistence.*


@Entity
@Table(name = "document")
data class EntityDocument(

    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    @field:Column(name = "id", columnDefinition = "bigint")
    val id: Int? = null,

    @field:Column(name = "uid", columnDefinition = "varchar(255)")
    val uid: String? = null,

    @ManyToOne
    @field:JoinColumn(name = "idCompany", referencedColumnName = "id", columnDefinition = "INT")
    val idCompany: EntityCompany? = null,

    @ManyToOne
    @field:JoinColumn(name = "idCategory", referencedColumnName = "id", columnDefinition = "INT")
    val idCategory: EntityDocumentCategory? = null,

    @field:Column(name = "name", columnDefinition = "varchar(255)")
    val name: String? = null,

    @field:Column(name = "description", columnDefinition = "varchar(255)")
    val description: String? = null,


    @field:Column(name = "createdAt", columnDefinition = "timestamp")
    val createdAt: LocalDateTime? = null,

    @field:Column(name = "updatedAt", columnDefinition = "timestamp")
    val updatedAt: LocalDateTime? = null

)
