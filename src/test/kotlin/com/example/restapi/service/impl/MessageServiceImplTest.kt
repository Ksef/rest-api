package com.example.restapi.service.impl

import com.example.restapi.model.Message
import com.example.restapi.repository.MessageRepo
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MessageServiceImplTest {

    private val messageRepo: MessageRepo = mockk()
    private val messageService = MessageServiceImpl(messageRepo)

    private val someMessage = Message(1,"some String")

    @Test
    fun createMessage() {
        //given
        every { messageRepo.save(someMessage) } returns someMessage

        //when
        val result = messageService.createMessage(someMessage)

        //then
        verify { messageRepo.save(someMessage) }
        assertEquals(someMessage, result)
    }

    @Test
    fun findMessageById() {
        //given
        every { messageRepo.getReferenceById(1) } returns someMessage

        //when
        val result = messageService.findMessageById(1)

        //then
        verify(exactly = 1) { messageRepo.getReferenceById(1) }
        assertEquals(someMessage, result)
    }

    @Test
    fun updateMessageById() {
        //TODO
//        //given
//        every { messageRepo.save(someMessage) } returns someMessage
//
//        //when
//        val result = messageService.updateMessageById(someMessage)
//
//        //then
//        verify { messageRepo.save(someMessage) }
//        assertEquals(someMessage, result)
    }

    @Test
    fun deleteMessageById() {
        //TODO
//        //given
//        every { messageRepo.existsById(someMessage.id) } returns true
//        every { messageRepo.deleteById(someMessage.id) }
//
//        //when
//        val result = messageService.deleteMessageById(someMessage.id)
//
//        //then
//        verify { messageRepo.deleteById(someMessage.id) }
//        assertEquals(someMessage, result)
    }

}