package resources

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import webclient.model.Movy
import org.succlz123.lib.imageloader.ImageAsyncImageUrl
import org.succlz123.lib.imageloader.core.ImageCallback
import webclient.utils.NetworkUtils

@Composable
fun AsyncImage(movie: Movy) {
    return if (NetworkUtils.getOkHttpStatus(movie.poster) != 200) {
        ImageAsyncImageUrl("https://i.imgur.com/q6VYuim.png",
            imageCallback = ImageCallback {
                Image(
                    modifier = Modifier
                        .width(200.dp)
                        .clip(shape = RoundedCornerShape(5.dp)),
                    painter = it,
                    contentDescription = "Capa"
                )
            })
    } else {
        ImageAsyncImageUrl(movie.poster,
            imageCallback = ImageCallback {
                Image(
                    modifier = Modifier
                        .width(200.dp)
                        .clip(shape = RoundedCornerShape(5.dp)),
                    painter = it,
                    contentDescription = "Capa"
                )
            })
    }
}

@Composable
fun MovieItemCompose(movie: Movy) {
    val tamanhoFonte = 15
    val tamanhoFonteTitulo = 12

    Surface(
        //color = Color(0xFF140c0c),
        color = Color(0xFF121212),
        shape = RoundedCornerShape(5.dp),
        modifier = Modifier.size(width = 260.dp, height = 270.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(10.dp)
        ) {
            Column {
                AsyncImage(movie)
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
                                text = movie.imdbRating,
                                color = Color.White,
                                fontSize = tamanhoFonte.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Text(text = movie.year, color = Color.White, fontSize = tamanhoFonte.sp)
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),

                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = movie.title,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            fontSize = tamanhoFonteTitulo.sp,
                            lineHeight = 1.em
                        )
                    }
                }
            }
        }
    }
}