package com.techno.latihan4springbootdasar.repository

import com.techno.latihan4springbootdasar.domain.entity.EntityCompany
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.transaction.annotation.Transactional
import java.util.*

interface RepositoryCompany: JpaRepository<EntityCompany, String> {

    fun findByUid(uid: String): EntityCompany?
    fun findById(id: Int): EntityCompany?




    @Modifying
    @Transactional
    @Query(value = "DELETE EntityCompany WHERE id = :id")
    fun deleteId(id: Int): Int?
}