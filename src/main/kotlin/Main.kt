import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import data.movies
import kotlinx.coroutines.launch
import resources.MovieItem


@Composable
@Preview
fun App() {
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
            items(movies) { movie ->
                MovieItem(movie)
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
        App()
    }
}
