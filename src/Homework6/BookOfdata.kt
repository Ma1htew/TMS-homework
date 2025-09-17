package Homework6

import Homework6.Borrowable as Borrowable1

data class BookOfdata (
    var title : String,
    var author : String,
    var year : Int,
    var genre: Genre,
    override var id : Int ): LibraryItem(id), Borrowable1 {
    override fun borrow(user: String) {

    }
}
