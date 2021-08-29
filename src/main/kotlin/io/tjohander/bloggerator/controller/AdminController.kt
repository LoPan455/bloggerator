package io.tjohander.bloggerator.controller

import io.tjohander.bloggerator.repository.PostRepository
import io.tjohander.bloggerator.repository.UserRepository
import io.tjohander.bloggerator.service.PostService
import io.tjohander.bloggerator.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/admin/v1")
class AdminController(
    @Autowired private val userService: UserService,
    @Autowired private val postService: PostService,
    @Autowired private val userRepository: UserRepository,
    @Autowired private val postRepository: PostRepository,
) {

    @RequestMapping("/seed-users")
    fun seedPosts() {
        userService.getUsers()?.map {
            userRepository.save(it)
        }
    }

    @RequestMapping("/seed-posts")
    fun seedUsers() {
        postService.getPostsFromApi()?.map {
            postRepository.save(it)
        }
    }


}