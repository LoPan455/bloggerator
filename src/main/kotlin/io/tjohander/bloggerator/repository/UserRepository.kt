package io.tjohander.bloggerator.repository

import io.tjohander.bloggerator.model.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, Int>