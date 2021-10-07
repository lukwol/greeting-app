package com.example.greetingapp.input

import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import io.kotest.matchers.shouldBe
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class InputViewModelTest {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    private lateinit var inputViewModel: InputViewModel

    @Before
    fun setUp() {
        inputViewModel = InputViewModel()
    }

    @Test
    fun testUpdatingName() {
        inputViewModel.updateName("Adam")
        inputViewModel.name.value shouldBe "Adam"
    }
}
