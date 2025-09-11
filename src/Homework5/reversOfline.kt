package Homework5
/*
Напишите программу,которая принимает строку и переставляет слова в обратном порядке
используя только методы String и StringBilder
 */

fun main() {
    println("Enter a line:")
    val str = readln()
    val sb = StringBuilder()
    val word = StringBuilder()

    for (i in str.length - 1 downTo 0) {
        val ch = str[i]

        if (ch != ' ') {
            word.append(ch)
        }

        if (ch == ' ' || i == 0) {
            sb.append(word.reverse())
            word.clear()
            if (ch == ' ') sb.append(' ')
        }
    }

    println(sb.toString())
}

