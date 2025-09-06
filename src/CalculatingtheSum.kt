/*
Hапишите программу, которая принимает на вход положительное число и находит сумму его цифр, повторяя процесс,
 пока результат не станет однозначным числом (например, для 9875: 9+8+7+5 = 29, затем 2+9 = 11, и, наконец, 1+1 = 2).
 */


fun calculatingtheSum() {
    print("enter number : ")
    var number = readln().toInt()

    while (number > 9) {
        var summa = 0
        var temp = number

        while (temp > 0) {
            summa += temp % 10
            temp /= 10
        }

        number = summa

    }

    println("Result : $number")
}