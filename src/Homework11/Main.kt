package Homework11

import java.util.LinkedList

fun main() {
    val lastOfpeople = LinkedList(
        listOf(1, 2, 5, 6, 7, 8)
    )
    var index = 0
    while (lastOfpeople.size > 1) {
        index = (index + 1) % lastOfpeople.size
        println(" ${lastOfpeople[index]}")
        lastOfpeople.removeAt(index)
    }
    println("winner: ${lastOfpeople[0]}")
    sortedOftwo()
}


fun sortedOftwo() {

    val list1 = LinkedList(listOf(1, 3, 5, 7))
    val list2 = LinkedList(listOf(2, 4, 6, 8))
    val mergList = LinkedList<Int>()
    var i = 0
    var j = 0
    while (i < list1.size && j < list2.size) {
        if (list1[i] < list2[j]) {
            mergList.add(list1[i])
            i++
        } else {
            mergList.add(list2[j])
            j++
        }
    }
    while (i < list1.size) {
        mergList.add(list1[i])
        i++
    }
    while (j < list2.size) {
        mergList.add(list2[j])
        j++
    }

    println("sorted: $mergList")
}
