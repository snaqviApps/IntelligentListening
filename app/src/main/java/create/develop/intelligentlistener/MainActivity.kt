package create.develop.intelligentlistener

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import create.develop.intelligentlistener.ui.theme.IntelligentListenerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IntelligentListenerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android-with jj",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.padding(top = 32.dp, bottom = 32.dp),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn()
        { items(5) { i ->
            Box(
                modifier = Modifier.padding(4.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "$name! What's Mashto-android + $i",
                    modifier = modifier
                        .background(Color.Cyan)
                        .padding(2.dp)
                        .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = ripple(
                            bounded = false,
                            radius = 24.dp
                        ),
                        onClick = {
                            println("onclick Clicked $i")
                        }
                    ),
                    textAlign = TextAlign.Center,
                )
            }

            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IntelligentListenerTheme {
        Greeting("Android")
    }
}