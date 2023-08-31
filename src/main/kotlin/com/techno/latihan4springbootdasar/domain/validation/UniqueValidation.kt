package com.techno.latihan4springbootdasar.domain.validation

import com.techno.latihan4springbootdasar.domain.validation.validator.UniqueValidator
import java.lang.annotation.Documented
import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass


@Documented
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
@Constraint(validatedBy = [UniqueValidator::class])
annotation class UniqueValidation(

    val message: String = "field must be unique",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)
