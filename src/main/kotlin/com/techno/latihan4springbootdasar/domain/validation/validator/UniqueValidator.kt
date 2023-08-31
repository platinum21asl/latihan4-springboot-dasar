package com.techno.latihan4springbootdasar.domain.validation.validator

import com.techno.latihan4springbootdasar.domain.validation.UniqueValidation
import com.techno.latihan4springbootdasar.repository.RepositoryUsers
import org.springframework.data.jpa.repository.JpaRepository
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class UniqueValidator(
    private val repositoryUsers: RepositoryUsers
): ConstraintValidator<UniqueValidation, String> {
    override fun isValid(value: String?, context: ConstraintValidatorContext?): Boolean {
        if(value == null){
            return  true
        }

        val data = repositoryUsers.findAll()
        data.forEach {
            if(it.username == value || it.email == value)
                return false
        }

        return  true
    }

}