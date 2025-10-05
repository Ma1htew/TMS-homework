package Homework12

fun main() {
    val words = listOf("listen", "silent", "enlist", "java", "avaj", "world")
    val groups = mutableListOf<MutableList<String>>()

    for (word in words) {
        var foundGroup = false
        for (group in groups) {
            if (areAnagrams(word, group[0])) {
                group.add(word)
                foundGroup = true
                break
            }
        }
        if (!foundGroup) {
            groups.add(mutableListOf(word))
        }
    }

    for (group in groups) {
        println(group)

    }
    firstOf()
}
fun areAnagrams(word1: String, word2: String): Boolean {
    return word1.toCharArray().sorted() == word2.toCharArray().sorted()

}
fun firstOf() {
    val numbers = listOf(4, 2, 7, 3, 2, 5, 7, 1)
    val seen = mutableSetOf<Int>()
    var firstDuplicate: Int? = null

    for (num in numbers) {
        if (num in seen) {
            firstDuplicate = num
            break
        } else {
            seen.add(num)
        }
    }

    if (firstDuplicate != null) {
        println("first: $firstDuplicate")
    } else {
        println("no dublicate number")
    }
}
