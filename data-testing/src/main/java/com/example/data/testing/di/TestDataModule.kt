package com.example.data.testing.di

import com.example.data.di.DataModule
import com.example.data.repositories.GreetingRepository
import com.example.data.testing.repositories.MockGreetingRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [DataModule::class]
)
interface TestDataModule {
    @Binds
    fun bindMockGreetingRepository(impl: MockGreetingRepositoryImpl): GreetingRepository
}
