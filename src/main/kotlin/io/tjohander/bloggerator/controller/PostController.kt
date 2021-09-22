package io.tjohander.bloggerator.controller

import io.tjohander.bloggerator.model.Post
import io.tjohander.bloggerator.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("post/v1")
class PostController(
    @Autowired private val postService: PostService
) {

    @RequestMapping("/")
    fun getPosts(): List<Post> {
        return postService.getPosts().take(5)
    }
}