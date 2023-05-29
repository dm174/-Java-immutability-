fun main() {
    val likes = 100 // Здесь можно изменить значение переменной likes

    val message = when (likes) {
        in 0..9 -> "Кажется,никому не понравилось"
        in 10..99 -> "Понравилось: $likes человек"
        else -> "Понравилось: $likes человек"
    }

    println(message)
}