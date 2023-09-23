fun main() {
    println("Введите строку символов")
    val string = readln()

    if (string.isEmpty()) {
        println("Строка пустая")
        return
    }

    val charCount = IntArray(100)

    for (char in string) charCount[char.code]++

    for (i: Int in charCount.indices) {
        if (charCount[i] > 0) {
            val char = i.toChar()
            println("$char - ${charCount[i]}")
        }
    }
}