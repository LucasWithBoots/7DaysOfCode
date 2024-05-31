package modelo

data class Movie(
    val titulo: String,
    var imagem: String,
    val nota: String,
    val ano: String
) {

    init {
        if (imagem.isBlank()) {
            println("$titulo não possui imagem de capa")

            imagem = "https://i.imgur.com/q6VYuim.png"
        }
    }

}

