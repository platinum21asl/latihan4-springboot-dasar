package com.techno.latihan4springbootdasar.repository


import com.techno.latihan4springbootdasar.domain.entity.EntityUsers
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.transaction.annotation.Transactional

interface RepositoryUsers: JpaRepository<EntityUsers, String> {

    fun findByUid(uid: String): EntityUsers?

    fun findById(id: Int): EntityUsers?

    fun findByUsername(username: String ): EntityUsers?


    @Modifying
    @Transactional
    @Query(value = "DELETE EntityUsers WHERE id = :id")
    fun deleteId(id: Int): Int?
}