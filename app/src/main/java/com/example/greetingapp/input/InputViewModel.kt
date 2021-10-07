package com.example.greetingapp.input

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class InputViewModel @Inject constructor() : ViewModel() {
    private val _name = MutableStateFlow("")
    val name: StateFlow<String>
        get() = _name

    fun updateName(name: String) {
        _name.value = name
    }
}
