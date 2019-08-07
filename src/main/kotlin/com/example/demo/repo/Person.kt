package com.example.demo.repo

import com.arangodb.springframework.annotation.Document
import org.springframework.data.annotation.Id

@Document(value = "persons")
data class Person(
        @Id
        private val id: String,
        private val foo: Any,
        private val bar: Any
)
