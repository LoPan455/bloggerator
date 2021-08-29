package io.tjohander.bloggerator

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BloggeratorApplication

fun main(args: Array<String>) {
    SpringApplication.run(BloggeratorApplication::class.java, *args)
}