package Homework8

//Паладин — много здоровья, слабая атака, тяжелая броня
class Paladin(
    var armorType: String = "heavy armor",
    var health: Double = 300.0,
    var weaponLower: Double = 50.0,
) : Armor, Weapon, Health {

    override fun attack() = weaponLower
    override fun defend(damage: Double): Double {
        return damage * 0.25
    }

    override fun takeDamage(damage: Double) {
        health -= damage
        if (health < 0) health = 0.0
    }

    override fun isAlive(): Boolean = health > 0
    override fun toString(): String {
        return "Paladin(armor='$armorType', health=$health, weaponLower=$weaponLower)"
    }


}