package com.example.greetingapp.input

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.greetingapp.components.Spacers
import com.example.greetingapp.locals.LocalNavController

@Composable
fun InputScreen(viewModel: InputViewModel = hiltViewModel()) {
    val name by viewModel.name.collectAsState()
    val navHostController = LocalNavController.current

    Surface {
        Input(
            name = name,
            onUpdate = viewModel::updateName,
            onGoButtonClicked = { navHostController.navigate("greeting/$name") }
        )
    }
}

@Composable
fun Input(
    name: String,
    onUpdate: (String) -> Unit,
    onGoButtonClicked: () -> Unit,
) {
    val scrollState = rememberScrollState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        Text("Greet Me!")
        Spacers.l()

        TextField(value = name, onValueChange = onUpdate)
        Spacers.l()

        Button(
            onClick = onGoButtonClicked,
            enabled = name.isNotEmpty()
        ) {
            Text("GO!")
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
fun InputPreviewLight() {
    Input(
        name = "Android",
        onUpdate = { },
        onGoButtonClicked = { }
    )
}
