package com.example.tiptime

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.*
import org.junit.Rule
import org.junit.Test

class TipCalculatorTests {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun calculate_20_percent_tip() {

        composeTestRule.onNodeWithText("Cost of Service")
            .performTextInput("50")

        composeTestRule.onNodeWithText("20%")
            .performClick()

        composeTestRule.onNodeWithText("Tip Amount: $10.00")
            .assertExists()
    }
}