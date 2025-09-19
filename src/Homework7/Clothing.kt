package Homework7

class Clothing(
    var price: Double,
    val clothingType: ClothingType
) : Product {
    override fun getFinalPrice(): Double {
        return price * 0.85
    }

    override fun toString(): String {
        return "Clothing(price=$price, clothingType=$clothingType)"
    }

}