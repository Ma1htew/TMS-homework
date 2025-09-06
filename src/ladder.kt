fun ladder() {
    print("enter : ")
    val n = readln().toInt()

    for (i in n downTo 1) {
        println("#".repeat(i))
    }
}
