package Homework4
/*
Напишите программу, которая принимает массив целых чисел и подсчитывает,
сколько четных и сколько нечетных чисел в нем содержится.

 */
fun  main (){
    val array = arrayOf(1,3,5,7,8,9,12,14)
    var evencount = 0
    var oddcount = 0
    for (i in array.indices){
        val number = array[i]
        if (number % 2 == 0) {
            evencount++
        } else {
            oddcount++
        }
    }

    println("Even number: $evencount")
    println("Odd number: $oddcount")


}