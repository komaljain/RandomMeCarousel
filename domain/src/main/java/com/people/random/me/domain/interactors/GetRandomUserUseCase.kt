package com.people.random.me.domain.interactors

import com.people.random.me.domain.entities.User
import com.people.random.me.domain.repositories.UserRepository


internal class GetRandomUserUseCase : BaseUseCase<Int?, List<User?>?> {
    private val userRepository: UserRepository? = null
    override fun execute(parameter: Int?) : BaseUseCase.Callback<List<User?>?>? {
        return userRepository.getRandomUsers()
    }

}
