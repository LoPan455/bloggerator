package io.tjohander.bloggerator.service

import io.tjohander.bloggerator.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class UserService(
    @Autowired private val apiClient: RestTemplate
) {
    fun getUsers(): List<User>? = apiClient.exchange(
        "/users",
        HttpMethod.GET,
        null,
        object : ParameterizedTypeReference<List<User>> () {}
    ).body
}