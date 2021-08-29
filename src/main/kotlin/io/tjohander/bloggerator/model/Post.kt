package io.tjohander.bloggerator.model

import org.springframework.data.annotation.Id

data class Post(
    @Id
    val id: String? = null,
    val userId: String? = null,
    val title: String? = null,
    val body: String? = null,
)