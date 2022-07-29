package com.example.restapi.model

import org.hibernate.Hibernate
import javax.persistence.*

@Entity
@Table(name = "messages")
data class Message(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,

    val text: String
)