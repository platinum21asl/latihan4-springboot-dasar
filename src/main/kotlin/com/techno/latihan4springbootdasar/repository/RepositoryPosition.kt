package com.techno.latihan4springbootdasar.repository

import com.techno.latihan4springbootdasar.domain.entity.EntityPosition
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.transaction.annotation.Transactional

interface RepositoryPosition : JpaRepository<EntityPosition, String> {

    fun findByUid(uid: String): EntityPosition?
    fun findById(id: Int): EntityPosition?
    @Modifying
    @Transactional
    @Query(value = "DELETE EntityPosition WHERE id = :id")
    fun deleteId(id: Int): Int?
}