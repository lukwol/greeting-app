package com.example.greetingapp.greeting

import androidx.lifecycle.SavedStateHandle
import com.example.greetingapp.proxy.GreetingViewModelProxy
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import io.kotest.matchers.shouldBe
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
class GreetingViewModelTest {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    private lateinit var greetingViewModel: GreetingViewModel

    @Inject
    lateinit var viewModelProxy: GreetingViewModelProxy

    @Before
    fun setUp() {
        hiltRule.inject()
        greetingViewModel = viewModelProxy
            .initializeViewModel(SavedStateHandle(mapOf("name" to "Adam")))
    }

    @Test
    fun testGettingName() {
        greetingViewModel.name shouldBe "Adam"
    }

    @Test
    fun testGettingGreeting() {
        greetingViewModel.greeting shouldBe "Cześć"
    }
}
