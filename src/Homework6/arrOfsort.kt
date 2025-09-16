package Homework6

fun main() {
    val arr = arrayOf( 4, -3, 2, -1, 0, -5)
    val result = Array(arr.size) { 0 }
    var index = 0
    for (i in arr.indices) {
        if (arr[i] < 0) {
            result[index] = arr[i]
            index++
        }
    }
    for (i in arr.indices) {
        if (arr[i] >= 0) {
            result[index] = arr[i]
            index++
        }
    }
    println(arr.joinToString())
    println(result.joinToString())

}
