import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.succlz123.lib.imageloader.ImageAsyncImageUrl
import org.succlz123.lib.imageloader.core.ImageCallback


@Composable
@Preview
fun App() {
    val titulo by remember { mutableStateOf("Wicked") }
    val nota by remember { mutableStateOf("Nota: 9.2 - Ano: 2024") }

    MaterialTheme {
        Column {
            Text(text = titulo)
            ImageAsyncImageUrl("https://i.imgur.com/g1n1j6D.jpeg",
                imageCallback = ImageCallback {
                    Image(
                        modifier = Modifier.width(200.dp),
                        painter = it,
                        contentDescription = "123")
                })
            Text(text = nota)
        }
    }
}

//fun requestHttp(link: String): String {
//    val client: HttpClient = HttpClient.newHttpClient()
//    val request = HttpRequest.newBuilder()
//        .uri(URI.create(link))
//        .build()
//    client.sendAsync(request, BodyHandlers.ofString())
//        .thenApply { obj: HttpResponse<*> -> obj.body() }
//        .thenAccept(System.out::println)
//        .join()
//
//    val response = client
//        .send(request, BodyHandlers.ofString())
//
//    println(response.body())
//    return response.body()
//}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "7DaysOfCode",
        icon = painterResource("logoAplicacao.png")
    ) {
        App()
    }
}
