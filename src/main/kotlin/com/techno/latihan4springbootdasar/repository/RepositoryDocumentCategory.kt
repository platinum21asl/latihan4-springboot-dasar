package com.techno.latihan4springbootdasar.repository

import com.techno.latihan4springbootdasar.domain.entity.EntityCompany
import com.techno.latihan4springbootdasar.domain.entity.EntityDocumentCategory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.transaction.annotation.Transactional

interface RepositoryDocumentCategory : JpaRepository<EntityDocumentCategory, String> {

    fun findByUid(uid: String): EntityDocumentCategory?

    fun findById(id: Int): EntityDocumentCategory?


    @Modifying
    @Transactional
    @Query(value = "DELETE EntityDocumentCategory WHERE id = :id")
    fun deleteId(id: Int): Int?
}