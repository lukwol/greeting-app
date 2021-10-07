package com.example.data.testing.repositories

import com.example.data.repositories.GreetingRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MockGreetingRepositoryImpl @Inject constructor() : GreetingRepository {
    override fun getGreeting() = "Cześć"
}
