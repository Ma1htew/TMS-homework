package Homework6

fun main() {
    val book1 = Book("Prince of London", "Edward M.", 2009,Genre.HISTORY,1,)
    val book2 = Book("Selvestor Stalonne", "Garry Ford", 1999, Genre.FANTASY,2,)
    val book3 = Book("Arcobalenno", "Max Lavrov", 2023, Genre.DETECTIVE,3,)
println(book1)
println(book2)
println(book3)
    val book4 = Book("Prince of London", "Edward M.", 2010, Genre.SCIENCE, 4)
    println("book2 == book4  ${book2 == book4}")

}