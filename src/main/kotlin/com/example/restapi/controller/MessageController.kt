package com.example.restapi.controller

import com.example.restapi.model.Message
import com.example.restapi.service.MessageService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.constraints.NotNull

@RestController
@RequestMapping("/message")
class MessageController(val messageService: MessageService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createMessage(@RequestBody message: Message): Message {
        return messageService.createMessage(message)
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    fun findMessageById(@PathVariable id: Int): Message {
        return messageService.findMessageById(id)
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun updateById(@NotNull @PathVariable id: Int, @RequestBody message: Message): Message {
        message.id = id
        return messageService.updateMessageById(message)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun deleteById(@NotNull @PathVariable id: Int){
        messageService.deleteMessageById(id)
    }
}