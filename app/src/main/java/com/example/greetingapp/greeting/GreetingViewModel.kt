package com.example.greetingapp.greeting

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.data.repositories.GreetingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class GreetingViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    greetingRepository: GreetingRepository
) : ViewModel() {
    val name: String = savedStateHandle.get("name") ?: ""
    val greeting = greetingRepository.getGreeting()
}
