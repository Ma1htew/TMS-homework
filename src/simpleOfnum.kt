/* Попросите пользователя ввести число и определите, является ли оно простым.
 Простое число — это число, которое делится только на 1 и само на себя.
 Используйте цикл для проверки всех возможных делителей.
 */

fun simpleOfnum() {
    println("enter number : ")
    var number = readln().toInt()

    if (number < 1) {
        println("not prime simple number ")
        return
    }
    if (number == 2) {
        println("is prime simple number ")
        return
    }
    for (i in 2 until number) {
        println("check $i: $number % $i = ${number % i}")

        if (number % i == 0) {
            println(" $i -> not prime simple ")
            return
        }
    }

    println(" -> prime simple")
}