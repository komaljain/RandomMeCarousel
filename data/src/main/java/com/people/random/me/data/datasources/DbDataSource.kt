package com.people.random.me.data.datasources

import com.people.random.me.domain.entities.User

interface DbDataSource {

    fun getRandomUsers() : List<User>
}