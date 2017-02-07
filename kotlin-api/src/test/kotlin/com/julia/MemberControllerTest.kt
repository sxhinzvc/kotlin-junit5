package com.julia

import org.junit.jupiter.api.Test
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import java.net.URI

class MemberControllerTest {

    val memberController = MemberController()
    val mvc: MockMvc = MockMvcBuilders.standaloneSetup(memberController).build()

    @Test
    fun `maps GET`() {
        mvc.perform(get(URI("/")))
                .andExpect(status().isOk)
    }
}