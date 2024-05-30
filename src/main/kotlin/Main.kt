import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.succlz123.lib.imageloader.ImageAsyncImageUrl
import org.succlz123.lib.imageloader.core.ImageCallback


@Composable
@Preview
fun App() {
    val titulo by remember { mutableStateOf("Wicked") }
    val nota by remember { mutableStateOf("9.2") }
    val ano by remember { mutableStateOf("2024") }

    val tamanhoFonte = 15
    val tamanhoFonteTitulo = 12

    MaterialTheme {
        Surface(
            //color = Color(0xFF140c0c),
            color = Color(0xFF121212),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.size(width = 200.dp, height = 350.dp)
        ) {
            Box(
                modifier = Modifier
                    .padding(10.dp)
            ) {
                Column {
                    ImageAsyncImageUrl("https://i.imgur.com/g1n1j6D.jpeg",
                        imageCallback = ImageCallback {
                            Image(
                                modifier = Modifier
                                    .width(200.dp)
                                    .clip(shape = RoundedCornerShape(5.dp)),
                                painter = it,
                                contentDescription = "Capa Wicked"
                            )
                        })
                    Column {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 5.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,

                            ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    Icons.Rounded.Star,
                                    contentDescription = "Estrela",
                                    modifier = Modifier
                                        .size(tamanhoFonte.dp),
                                    tint = Color.Yellow
                                )
                                Text(
                                    text = nota,
                                    color = Color.White,
                                    fontSize = tamanhoFonte.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Text(text = ano, color = Color.White, fontSize = tamanhoFonte.sp)
                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),

                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = titulo,
                                color = Color.White,
                                textAlign = TextAlign.Center,
                                fontSize = tamanhoFonteTitulo.sp
                            )
                        }
                    }
                }
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
