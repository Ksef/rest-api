package com.example.restapi.service.impl

import com.example.restapi.model.Message
import com.example.restapi.repository.MessageRepo
import com.example.restapi.service.MessageService
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody

@Service
class MessageServiceImpl(val messageRepo: MessageRepo) : MessageService {

    override fun createMessage(message: Message): Message {
       return messageRepo.save(message)
    }

    override fun findMessageById(id: Int): Message {
        return messageRepo.getReferenceById(id)
    }

    override fun updateMessageById(message: Message): Message {
        if (messageRepo.existsById(message.id)) {
            return messageRepo.save(message)
        } else throw Exception("Id not found")
    }

    override fun deleteMessageById(id: Int) {
        return messageRepo.deleteById(id)
    }
}