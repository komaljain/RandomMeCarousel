package com.people.random.me.data.datasources

import com.people.random.me.domain.entities.User

interface RestAPIDataSource {

    fun getRandomUsers() : List<User>
}