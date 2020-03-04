package com.people.random.me.data.repositories

import com.people.random.me.data.datasources.DbDataSource
import com.people.random.me.data.datasources.RestAPIDataSource
import com.people.random.me.domain.entities.User
import com.people.random.me.domain.repositories.UserRepository

class UserRepositoryImpl : UserRepository {

    private val restAPIDataSource: RestAPIDataSource = TODO()
    private val dbDataSource: DbDataSource = TODO()

    override fun getRandomUsers(): List<User> {
        return restAPIDataSource.getRandomUsers();
    }
}