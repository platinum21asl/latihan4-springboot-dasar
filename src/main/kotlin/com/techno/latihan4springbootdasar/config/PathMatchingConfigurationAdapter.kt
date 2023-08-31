package com.techno.latihan4springbootdasar.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


@Configuration
class PathMatchingConfigurationAdapter(
    val crudInterceptor: CrudInterceptor
) : WebMvcConfigurer {
    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(crudInterceptor).addPathPatterns("/api/position")
        registry.addInterceptor(crudInterceptor).addPathPatterns("/api/position/{uid}")
        registry.addInterceptor(crudInterceptor).addPathPatterns("/api/document_category")
        registry.addInterceptor(crudInterceptor).addPathPatterns("/api/document_category/{uid}")
        registry.addInterceptor(crudInterceptor).addPathPatterns("/api/company")
        registry.addInterceptor(crudInterceptor).addPathPatterns("/api/company/{uid}")
        registry.addInterceptor(crudInterceptor).addPathPatterns("/api/document")
        registry.addInterceptor(crudInterceptor).addPathPatterns("/api/document/{uid}")
        registry.addInterceptor(crudInterceptor).addPathPatterns("/api/users")
        registry.addInterceptor(crudInterceptor).addPathPatterns("/api/users/{users}")
    }
}