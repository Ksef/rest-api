package com.example.restapi.controller

import com.example.restapi.model.Message
import com.example.restapi.service.MessageService
import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*


@WebMvcTest
internal class MessageControllerTest(@Autowired val mockMvc: MockMvc) {

    @MockkBean
    lateinit var messageService: MessageService

    val message = Message(1,"some string")

    @Test
    fun createMessage() {
        //TODO
//        every { messageService.findMessageById(1) } returns message;
//
//        mockMvc.perform(get("/message/1"))
//            .andExpect(status().isOk)
    }

    @Test
    fun findMessageById() {
    }

    @Test
    fun updateById() {
    }

    @Test
    fun deleteById() {
    }

    @Test
    fun getMessageService() {
    }
}