fun main() {
    print("Введите два числа и символ операции (в формате ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ): ")
    val input = readLine() ?: ""

    val list = input.split(" ")

    if (list.size != 3) {
        println("Неверный формат ввода. Пожалуйста, используйте формат ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ")
        return
    }

    val num1 = list[0].toDoubleOrNull()
    val num2 = list[1].toDoubleOrNull()
    val operator = list[2]

    if (num1 == null || num2 == null) {
        println("Один или оба введенных значения не являются числами.")
        return
    }

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 == 0.0) {
                println("Ошибка: деление на ноль.")
                return
            }
            num1 / num2
        }

        else -> {
            println("Неверный символ операции. Введите: +, -, *, /")
            return
        }
    }

    println("Результат операции: $result")
}