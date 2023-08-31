package com.techno.latihan4springbootdasar.service.impl

import com.techno.latihan4springbootdasar.service.StartedService
import org.springframework.stereotype.Service

@Service
class StartedServiceImpl: StartedService {
    override fun runningProgram(number: Int) {
        println("Program running in port:  $number")
    }
}