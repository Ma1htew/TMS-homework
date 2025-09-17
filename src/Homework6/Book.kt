package Homework6
/*
Создать класс Book с:полями title, author, year
первичным конструктором.методом toString().
Добавить метод equals() и hashCode() для сравнения книг по названию и автору.
Создать enum class Genre (FANTASY, DETECTIVE, SCIENCE, HISTORY).
Сделать абстрактный класс LibraryItem (с полем id) и наследовать от него Book.
Создать interface Borrowable с методом borrow(user: String) и реализовать его в Book.
И создать аналог Book через Data class и сравнить логику методов tostring, equals, hashcode


 */
class Book (
    var title : String,
    var author : String,
    var year : Int,
    var genre: Genre,
    id : Int
): LibraryItem(id),Borrowable{
    override fun borrow(user: String) {
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Book

        if (title != other.title) return false
        if (author != other.author) return false

        return true
    }

    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + author.hashCode()
        return result
    }

    override fun toString(): String {
        return "Book(Название ='$title', Автор ='$author', Год издания =$year, Жанр =$genre , Номер=$id)"
    }

}