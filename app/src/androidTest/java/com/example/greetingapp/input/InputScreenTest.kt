package com.example.greetingapp.input

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import io.kotest.matchers.shouldBe
import org.junit.Rule
import org.junit.Test

class InputScreenTest {

    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun testInitialControlsState() {
        composeRule.setContent {
            Input(
                name = "",
                onUpdate = { },
                onGoButtonClicked = { }
            )
        }
        checkControlsState(
            nameTextFieldValue = "",
            goButtonEnabled = false
        )
    }

    @Test
    fun testControlsStateWhenNameIsProvided() {
        composeRule.setContent {
            Input(
                name = "Anna",
                onUpdate = { },
                onGoButtonClicked = { }
            )
        }
        checkControlsState(
            nameTextFieldValue = "Anna",
            goButtonEnabled = true
        )
    }

    @Test
    fun testUpdatingName() {
        var nameUpdateCalled = false
        composeRule.setContent {
            Input(
                name = "",
                onUpdate = { nameUpdateCalled = true },
                onGoButtonClicked = { }
            )
        }
        nameUpdateCalled shouldBe false
        nameTextField().performTextInput("a")
        nameUpdateCalled shouldBe true
    }

    @Test
    fun testClickingGoButton() {
        var goButtonClicked = false
        composeRule.setContent {
            Input(
                name = "Anna",
                onUpdate = { },
                onGoButtonClicked = { goButtonClicked = true }
            )
        }
        goButtonClicked shouldBe false
        goButton().performClick()
        goButtonClicked shouldBe true
    }
}

private fun InputScreenTest.titleText() = composeRule.onNodeWithText("Greet Me!")

private fun InputScreenTest.nameTextField() = composeRule.onNode(hasSetTextAction())

private fun InputScreenTest.goButton() =
    composeRule.onNode(hasClickAction() and hasSetTextAction().not())

private fun InputScreenTest.checkControlsState(
    nameTextFieldValue: String,
    goButtonEnabled: Boolean,
) {
    titleText()
        .assertExists()
        .assertHasNoClickAction()
    nameTextField()
        .assertTextEquals(nameTextFieldValue)
        .assertHasClickAction()
        .assertIsEnabled()
    goButton()
        .assertTextEquals("GO!")
        .assertHasClickAction()
        .also {
            if (goButtonEnabled) {
                it.assertIsEnabled()
            } else {
                it.assertIsNotEnabled()
            }
        }
}
