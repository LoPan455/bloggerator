package io.tjohander.bloggerator.config

import com.mongodb.ConnectionString
import com.mongodb.MongoClientSettings
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration

@Configuration
class MongoConfiguration(
    @Value("\${spring.data.mongodb.database}") private val dbname: String,
//    @Value("\${spring.data.mongodb.uri}") private val mongoUri: String
) : AbstractMongoClientConfiguration() {

    @Bean
    override fun mongoClient(): MongoClient {
        val connectionString = ConnectionString(getConnectionUri())
        val mongoClientSettings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build()
        return MongoClients.create(mongoClientSettings)
    }

    override fun getDatabaseName(): String {
        return dbname
    }

    private fun getConnectionUri(): String =
        System.getenv("MONGO_URI") ?: "mongodb://root:example@localhost:27017"
}