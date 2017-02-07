package com.julia

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class DeMemberApplication

fun main(args: Array<String>) {
    SpringApplication.run(DeMemberApplication::class.java, *args)
}
