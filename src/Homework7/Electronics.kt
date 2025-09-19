package Homework7

class Electronics(var price: Double,
val electronicsType: ElectronicsType ) : Product  {
    override fun getFinalPrice(): Double {
        return price * 0.9
    }

    override fun toString(): String {
        return "Electronics(price=$price, electronicsType=$electronicsType)"
    }
}