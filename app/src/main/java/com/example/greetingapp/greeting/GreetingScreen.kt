package com.example.greetingapp.greeting

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.greetingapp.components.Spacers
import com.example.greetingapp.locals.LocalNavController

const val NameKey = "name"

@Composable
fun GreetingScreen(viewModel: GreetingViewModel = hiltViewModel()) {
    val navHostController = LocalNavController.current

    Surface {
        Greeting(
            greeting = viewModel.greeting,
            name = viewModel.name,
            onBackButtonClicked = navHostController::popBackStack
        )
    }
}

@Composable
fun Greeting(
    greeting: String,
    name: String,
    onBackButtonClicked: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "$greeting, $name!")
        Spacers.l()

        Button(onClick = onBackButtonClicked) {
            Text("GO BACK!")
        }
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun GreetingPreviewDark() {
    Greeting(
        greeting = "Hello",
        name = "Android",
        onBackButtonClicked = { }
    )
}
