package Homework4

/*
Напишите программу, которая находит и выводит максимальное и минимальное значение в массиве целых чисел.
Также вычислите индекс этих элементов.
 */
fun main() {
    val array = arrayOf(3, 5, 6, 7, 8, 9)
    println("min value of arr: ") //метод поиска макс. и мин. значения массива через методы (.max .min)
    println(array.minOrNull())
    println("max value of arr: ")
    println(array.maxOrNull())

    maxAndmin()
}

fun maxAndmin() {
    val array = arrayOf(3, 5, 6, 7, 8, 9)   //метод поиска макс. и мин. значения массива через цикл

    var minValue = array[0]
    var maxValue = array[0]
    var minIndex = 0
    var maxIndex = 0

    for (i in array.indices) {
        if (array[i] < minValue) {
            minValue = array[i]
            minIndex = i
        }
        if (array[i] > maxValue) {
            maxValue = array[i]
            maxIndex = i
        }
    }

    println("Min value: $minValue at index $minIndex")
    println("Max value: $maxValue at index $maxIndex")
}