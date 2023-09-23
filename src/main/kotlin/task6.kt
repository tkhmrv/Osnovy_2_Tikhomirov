fun createOddNumber(digit1: Int, digit2: Int): Int? {
    if (digit1 < 0 || digit2 < 0 || digit1 > 9 || digit2 > 9 || digit1 == digit2 || (digit1 % 2 == 0 && digit2 % 2 == 0)) {
        return null
    }

    val oddDigit = if (digit1 % 2 != 0) digit1 else digit2
    val evenDigit = if (digit1 % 2 == 0) digit1 else digit2

    return (evenDigit * 10) + oddDigit
}

fun main() {
    print("Введите первую цифру: ")
    val digit1 = readLine()?.toIntOrNull()
    print("Введите вторую цифру: ")
    val digit2 = readLine()?.toIntOrNull()

    if (digit1 == null || digit2 == null) {
        println("Неверный формат ввода. Пожалуйста, введите цифру от 0 до 9.")
        return
    }

    val result = createOddNumber(digit1, digit2)

    if (result != null) {
        println("Созданное нечетное число: $result")
    } else {
        println("Создать нечетное число невозможно.")
    }
}