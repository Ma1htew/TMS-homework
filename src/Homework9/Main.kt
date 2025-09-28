package Homework9


fun main() {
    //Деление с обработкой исключения
    try {
        println("enter first number: ")
        val numf = readln().toInt()

        println("enter second number: ")
        val nums = readln().toInt()

        val division = numf / nums
        println("Result: $division")

    } catch (ex: ArithmeticException) {
        println("Division by 0 is not possible")
    } catch (ex: NumberFormatException) {
        println("Input error: please enter only numbers")
    }
    AgeVerification()
    ProcessingOfEmptystring()
}

fun AgeVerification() {
    //Проверка возраста (кастомное исключение)
    println("enter age: ")
    var age = readln().toInt()
    if (age > 18) {
        println(age)
    } else {
        throw TooYoungException()
    }
}

class TooYoungException(override val message: String? = "Возраст слишком мал") : Throwable() {

}

fun ProcessingOfEmptystring() {
    //Обработка пустой строки
    println("enter string: ")
    var str = readln()
    if (str.isEmpty()) {
        throw IllegalArgumentException("string empty")
    } else {
        println("enter : $str")
    }

}

