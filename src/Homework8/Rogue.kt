package Homework8

//Разбойник — сильная атака, среднее количество здоровья, средняя броня
class Rogue(
    var armorType: String = "Middle armor",
    var health: Double = 150.0,
    var weaponMiddle: Double = 120.0,
) : Armor, Weapon, Health {
    override fun attack(): Double = weaponMiddle
    override fun defend(damage: Double): Double {

        return damage * 0.5
    }

    override fun takeDamage(damage: Double) {
        health -= damage
        if (health < 0) health = 0.0
    }

    override fun isAlive(): Boolean = health > 0
    override fun toString(): String {
        return "Rogue(armorType='$armorType', health=$health, weaponMiddle=$weaponMiddle)"
    }


}