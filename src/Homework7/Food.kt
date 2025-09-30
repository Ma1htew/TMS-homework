package Homework7

class Food(var price: Double,
    val foodType: FoodType,):Product {
    override fun getFinalPrice(): Double {
        return price
    }

    override fun toString(): String {
        return "Food(price=$price, foodType=$foodType)"
    }
}