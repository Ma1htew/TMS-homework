package Homework8

// Лучник — очень сильная атака, мало здоровья, легкая броня
class Archer(
    var armorType: String = "Light armor",
    var health: Double = 70.0,
    var weaponPower: Double = 250.0,
) : Armor, Weapon, Health {


    override fun attack(): Double = weaponPower

    override fun defend(damage: Double): Double {
        return damage * 0.8
    }


    override fun takeDamage(damage: Double) {
        health -= damage
        if (health < 0) health = 0.0
    }


    override fun isAlive(): Boolean = health > 0

    override fun toString(): String {
        return "Archer(health=$health, weaponPower=$weaponPower, armorType=$armorType)"
    }
}
