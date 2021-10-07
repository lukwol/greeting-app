package com.example.data.di

import com.example.data.repositories.GreetingRepository
import com.example.data.repositories.GreetingRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {
    @Binds
    fun bindGreetingRepository(impl: GreetingRepositoryImpl): GreetingRepository
}
