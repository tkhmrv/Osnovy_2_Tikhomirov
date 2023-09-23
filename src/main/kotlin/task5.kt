fun findPower(n: Int, x: Int): Int? {
    if (n == 1) {
        return 0
    }

    var y = 1
    var result = x

    while (result < n) {
        result *= x
        y++
    }

    return if (result == n) y else null
}

fun main() {
    print("Введите целое число n: ")
    val n = readLine()?.toIntOrNull()
    print("Введите основание степени x: ")
    val x = readLine()?.toIntOrNull()

    if (n == null || x == null) {
        println("Неверный формат ввода. Пожалуйста, введите целое число.")
        return
    }

    val y = findPower(n, x)

    if (y != null) {
        println("Целочисленный показатель степени y: $y")
    } else {
        println("Целочисленный показатель не степени существует.")
    }
}