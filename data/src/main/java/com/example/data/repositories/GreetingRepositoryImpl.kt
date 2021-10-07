package com.example.data.repositories

import javax.inject.Inject
import javax.inject.Singleton

private val Greetings = listOf("Bonjour", "Hola", "Olá", "Ciao", "Hi", "Hallo", "Hey")

@Singleton
class GreetingRepositoryImpl @Inject constructor() : GreetingRepository {
    override fun getGreeting() = Greetings.random()
}
