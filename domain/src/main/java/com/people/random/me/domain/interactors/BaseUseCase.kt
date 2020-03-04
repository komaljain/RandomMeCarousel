package com.people.random.me.domain.interactors

interface BaseUseCase<P, R> {
    interface Callback<R> {
        fun onSuccess(return1: R)
        fun onError(throwable: Throwable?)
    }

    fun execute(parameter: P): Callback<R>?
}