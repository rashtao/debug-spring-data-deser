package com.example.demo.repo

import com.arangodb.springframework.repository.ArangoRepository

interface PersonRepo : ArangoRepository<Person, String> {

}