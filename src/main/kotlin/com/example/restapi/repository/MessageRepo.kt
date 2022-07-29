package com.example.restapi.repository

import com.example.restapi.model.Message
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepo: JpaRepository<Message, Int>