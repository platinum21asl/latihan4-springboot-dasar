package com.techno.latihan4springbootdasar.repository

import com.techno.latihan4springbootdasar.domain.entity.EntityToken
import org.springframework.data.jpa.repository.JpaRepository

interface RepositoryToken:JpaRepository<EntityToken, Int> {

    fun findIdByToken(token: String): EntityToken?
}