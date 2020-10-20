package com.aaa.window.Todo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/todo")
class TodoController(private val todoService: TodoService) {
    @GetMapping("test")
    fun helloWorld() : String {
        return "hello world"
    }

    @GetMapping()
    fun getTodos() : Flux<Todo> {
        return todoService.getAll()
    }
}