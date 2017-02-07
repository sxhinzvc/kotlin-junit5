package com.julia

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController {

    @GetMapping("/")
    fun getAllMembers() {
        "Hello kotlin"
    }
}