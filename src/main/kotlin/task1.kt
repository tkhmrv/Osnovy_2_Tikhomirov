fun main() {
    println("Введите строку символов: ")
    val string = readln()
    if (string.isEmpty()) {
        println("Строка пустая")
        return
    }

    var result = " "
    var count = 1

    for (i in 1..<string.length) {
        if (string[i] == string[i - 1]) count++ else {
            if (count > 1) {
                result += string[i - 1] + count.toString()
            } else {
                result += string[i - 1]
            }
            count = 1
        }
    }

    if (count > 1) {
        result += string.last() + count.toString()
    } else {
        result += string.last()
    }

    println("Результат: $result")
}