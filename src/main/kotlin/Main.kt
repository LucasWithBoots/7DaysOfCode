import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.google.gson.Gson
import kotlinx.coroutines.launch
import webclient.model.Root
import resources.MovieItemCompose
import webclient.utils.NetworkUtils


@Composable
@Preview
fun App() {
    val response = NetworkUtils.getOkHttpInstance("https://luwucaz.github.io/jsonFiles/movies-250.json")

    val gson = Gson()
    val dados = gson.fromJson(response, Root::class.java)

    val scrollState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    MaterialTheme {
        LazyColumn(
            state = scrollState,
            modifier = Modifier
                .draggable(
                    orientation = Orientation.Horizontal,
                    state = rememberDraggableState { delta ->
                        coroutineScope.launch {
                            scrollState.scrollBy(-delta)
                        }
                    },
                )
        ) {
            items(dados.movies) { data ->
                MovieItemCompose(data)
            }
        }
    }
}


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "7DaysOfCode",
        icon = painterResource("logoAplicacao.png")
    ) {
        Box(
            modifier = Modifier.fillMaxSize().background(Color.Black)
        ) {
            App()
        }
    }
}
