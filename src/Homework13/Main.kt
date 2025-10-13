package Homework13

/*
Task 1
Напишите функцию, которая принимает список целых чисел и возвращает их сумму.
Используйте лямбду в качестве параметра для определения операции. (Reduce)
 */
fun main() {
    val listOfNumb = mutableListOf(1, 3, 4, 5, 6, 7, 8)
    val changelist = listOfNumb.reduce { acc, num -> acc + num }
    println(changelist)
    AgeOfsort()
    NumbOfMillion()
}

/*
Task2
Напишите программу, которая получает список людей, фильтрует только тех, 
кто старше 18 лет, затем сортирует их по возрасту в порядке убывания 
и выводит на экран с помощью apply и let. (sortedByDescending)
 */

fun AgeOfsort() {
    val people = mutableMapOf(
        "Tom" to 23,
        "Andrew" to 16,
        "Jerry" to 18,
        "Jason" to 19
    )

    val ageSort = people.apply {
    }.filter { it.value >= 18 }

    ageSort
        .toList()
        .sortedByDescending { it.second }
        .let { sorted ->
            println("people > 18: ")
            sorted.forEach { (name, age) ->
                println("$name - $age")
            }
        }
}

/*
Task 3
Создайте список чисел от 1 до 1,000,000, отфильтруйте четные числа,
затем возведите их в квадрат и посчитайте сумму всех этих чисел.
Сделайте это с использованием asSequence для ленивой обработки.
 */
fun NumbOfMillion() {
    val result = (1L..1_000_000L)
        .asSequence()
        .filter { it % 2L == 0L }
        .map { it * it }
        .sum()
    println(result)
}
