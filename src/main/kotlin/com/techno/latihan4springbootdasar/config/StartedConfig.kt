package com.techno.latihan4springbootdasar.config

import com.techno.latihan4springbootdasar.service.StartedService
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component


@Component
class StartedConfig(
    private val startedService: StartedService
) {

    @Bean
    fun runningProgram(){
        startedService.runningProgram(9090)
    }
}