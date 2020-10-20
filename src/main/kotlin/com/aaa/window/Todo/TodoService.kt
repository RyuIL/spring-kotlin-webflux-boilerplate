package com.aaa.window.Todo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class TodoService(private val repo: TodoRepository) {
    fun getAll() : Flux<Todo> = repo.findAll()

    fun test() {
    }
}