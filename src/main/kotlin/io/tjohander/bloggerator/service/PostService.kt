package io.tjohander.bloggerator.service

import io.tjohander.bloggerator.model.Post
import io.tjohander.bloggerator.repository.PostRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class PostService(
    @Autowired private val apiClient: RestTemplate,
    @Autowired private val postRepository: PostRepository
) {
    fun getPostsFromApi(): List<Post>? = apiClient.exchange(
        "/posts",
        HttpMethod.GET,
        null,
        object : ParameterizedTypeReference<List<Post>> () {}
    ).body

    fun getPosts(): List<Post> =
        postRepository.findAll()
}