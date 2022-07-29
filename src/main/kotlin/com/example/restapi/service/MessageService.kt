package com.example.restapi.service

import com.example.restapi.model.Message

interface MessageService {

    fun createMessage(message: Message): Message

    fun findMessageById(id: Int): Message

    fun updateMessageById(message: Message): Message

    fun deleteMessageById(id: Int)
}
