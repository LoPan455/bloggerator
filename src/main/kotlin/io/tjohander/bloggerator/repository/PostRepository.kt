package io.tjohander.bloggerator.repository

import io.tjohander.bloggerator.model.Post
import org.springframework.data.mongodb.repository.MongoRepository

interface PostRepository : MongoRepository<Post, Int>