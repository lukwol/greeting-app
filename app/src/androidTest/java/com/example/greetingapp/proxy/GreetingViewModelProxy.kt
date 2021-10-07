package com.example.greetingapp.proxy

import androidx.lifecycle.SavedStateHandle
import com.example.data.repositories.GreetingRepository
import com.example.greetingapp.greeting.GreetingViewModel
import javax.inject.Inject

class GreetingViewModelProxy @Inject constructor(
    private val greetingRepository: GreetingRepository
) {
    fun initializeViewModel(savedStateHandle: SavedStateHandle?): GreetingViewModel {
        return GreetingViewModel(
            savedStateHandle = savedStateHandle ?: SavedStateHandle(mapOf()),
            greetingRepository = greetingRepository
        )
    }
}
