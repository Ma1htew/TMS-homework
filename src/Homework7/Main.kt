package Homework7

fun main (){
var electro = Electronics(1488.6, ElectronicsType.MobilePhone)
    var cloth = Clothing(49.99,ClothingType.Tshirt)
    var foods = Food(1.69 , FoodType.milkProduct)
   println("price before discount")
    println(electro)
    println(cloth)
    println(foods)
println("price after discount")
    println("${electro.electronicsType}: ${electro.getFinalPrice()} BYN")
    println("${cloth.clothingType}: ${cloth.getFinalPrice()} BYN")
    println("${foods.foodType}: ${foods.getFinalPrice()} BYN")

}
