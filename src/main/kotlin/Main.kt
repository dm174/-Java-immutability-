fun main() {
    val likes = 121 // Здесь можно изменить значение переменной likes

    val message = when {
        likes % 10 == 1 && likes % 100 != 11 -> "Понравилось $likes человеку"
        else -> "Понравилось $likes людям"
    }

    println(message)
}
