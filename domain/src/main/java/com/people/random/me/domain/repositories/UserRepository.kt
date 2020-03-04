package com.people.random.me.domain.repositories

import com.people.random.me.domain.entities.User

interface UserRepository {

    fun getRandomUsers(): List<User>
}