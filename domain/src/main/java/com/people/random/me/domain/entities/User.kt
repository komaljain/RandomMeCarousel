package com.people.random.me.domain.entities

data class User(
    val id: Long,
    val userId: Long,
    val title: String,
    val name: Name,
    val email: String,
    val gender: String,
    val location: Location,
    val username: String,
    val password: String,
    val registered: String,
    val dob: String,
    val phone: String,
    val cell: String,
    val SSN: String,
    val picture: String) {
}