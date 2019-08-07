package com.example.demo

import com.example.demo.repo.Person
import com.example.demo.repo.PersonRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.annotation.PostConstruct

@SpringBootApplication
class DemoApplication {

    @Autowired
    private lateinit var personRepo: PersonRepo

    @PostConstruct
    fun init() {
        personRepo.save(Person(
                id = "pid",
                foo = listOf("a", "b"),
                bar = mapOf("work" to "9999")
        ))
        val p = personRepo.findById("pid")
        println(p)
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
