package com.aaa.window

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories


@SpringBootApplication
class WindowApplication

fun main(args: Array<String>) {
    runApplication<WindowApplication>(*args)
}

