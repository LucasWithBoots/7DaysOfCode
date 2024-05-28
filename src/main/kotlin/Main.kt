import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    val titulo by remember { mutableStateOf("Wicked") }
    val nota by remember { mutableStateOf("Nota: 9.2 - Ano: 2024") }

    MaterialTheme {
        Column {
            Text(text = titulo)
            Image(
                painter = painterResource("capaFilme.jpg"),
                contentDescription  = "Capa Wicked",
                modifier = Modifier.width(200.dp)
            )
            Text(text = nota)
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "7DaysOfCode",
        icon = painterResource("logoAplicacao.png")
    ) {
        App()
    }
}
