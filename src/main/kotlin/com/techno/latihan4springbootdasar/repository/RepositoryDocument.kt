package com.techno.latihan4springbootdasar.repository

import com.techno.latihan4springbootdasar.domain.entity.EntityCompany
import com.techno.latihan4springbootdasar.domain.entity.EntityDocument
import com.techno.latihan4springbootdasar.domain.entity.EntityUsers
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.transaction.annotation.Transactional

interface RepositoryDocument: JpaRepository<EntityDocument, String> {

    fun findByUid(uid: String): EntityDocument?
    fun findById(id: Int): EntityDocument?

    @Modifying
    @Transactional
    @Query(value = "DELETE EntityDocument WHERE id = :id")
    fun deleteId(id: Int): Int?
}