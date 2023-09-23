fun numToBinary(num: Int): String {
    if (num == 0) return "0"

    var number = num
    var binary = " "

    while (number > 0) {
        val remain = number % 2
        binary = "$remain$binary"
        number /= 2
    }

    return binary
}

fun main() {
    print("Введите натуральное число в 10-ной системе счисления: ")
    val num = readLine()?.toIntOrNull()

    if (num == null || num < 0) {
        println("Неверный ввод. Введите положительное натуральное число")
        return
    }

    val numBinary = numToBinary(num)
    println("Ваше число в двоичной системе: $numBinary")
}