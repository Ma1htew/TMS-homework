/* Напишите программу, которая проверяет, является ли введённое пользователем число палиндромом
 (читается одинаково слева направо и справа налево).
 Используйте цикл для разбиения числа и сравнения цифр.
 */
fun Palindrom (){
    println("enter number: ")
    val number = readln().toInt()
    var temp = number
    var reversed = 0


    while (temp > 0) {
        val digit = temp % 10
        reversed = reversed * 10 + digit
        temp /= 10
    }

    if (number == reversed) {
        println("$number — palindrom")
    } else {
        println("$number — no palindrom")
    }
}