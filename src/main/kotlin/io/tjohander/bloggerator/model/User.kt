package io.tjohander.bloggerator.model

import org.springframework.data.annotation.Id

data class User(
    @Id
    val id: String? = null,
    val name: String? = null,
    val username: String? = null,
    val email: String? = null,
    val address: Address? = null,
    val phone: String? = null,
    val website: String? = null,
    val company: Company? = null
)
