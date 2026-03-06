package create.develop.core.presentation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person

import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview

class DemoPresentation {

    @Composable
    fun HelloCompose() {
        Icons.Default.Person
        Text("Hi Compose",
            color = Color.Cyan
            )

    }

    @Preview
    @Composable
    fun PreviewHelloCompose() {
        HelloCompose()
    }

}
