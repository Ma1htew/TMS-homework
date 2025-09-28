package Homework8

fun main() {
    println("Выберите персонажа:")
    println("1 - Паладин (много HP, слабая атака, тяжёлая броня)")
    println("2 - Разбойник (средний HP, сильная атака, средняя броня)")
    println("3 - Лучник (мало HP, очень сильная атака, лёгкая броня)")

    // выбор игрока 1
    print("Игрок 1, ваш выбор: ")
    val choice1 = readln().toInt()
    val player1: Any = when (choice1) {
        1 -> Paladin()
        2 -> Rogue()
        3 -> Archer()
        else -> Paladin()
    }


    var player2: Any? = null
    while (player2 == null) {
        print("Игрок 2, ваш выбор: ")
        val choice2 = readln().toInt()
        if (choice2 == choice1) {
            println("Этот персонаж уже выбран! Выберите другого.")
        } else {
            player2 = when (choice2) {
                1 -> Paladin()
                2 -> Rogue()
                3 -> Archer()
                else -> Rogue()
            }
        }
    }

    println("\nНачинается бой!")
    println("Игрок 1: $player1")
    println("Игрок 2: $player2")

    var round = 1


    val p1 = player1 as Weapon
    val p1Armor = player1 as Armor
    val p1Health = player1 as Health

    val p2 = player2 as Weapon
    val p2Armor = player2 as Armor
    val p2Health = player2 as Health

    while ((player1 as Health).isAlive() && (player2 as Health).isAlive()) {
        println("\nРаунд $round")


        val damage1 = p1.attack()
        val reducedDamage1 = p2Armor.defend(damage1)
        p2Health.takeDamage(reducedDamage1)
        println("Игрок 1 атакует на $damage1 → Игрок 2 получает $reducedDamage1 урона")

        if (!(player2 as Health).isAlive()) {
            println("Игрок 2 пал!")
            break
        }


        val damage2 = p2.attack()
        val reducedDamage2 = p1Armor.defend(damage2)
        p1Health.takeDamage(reducedDamage2)
        println("Игрок 2 атакует на $damage2 → Игрок 1 получает $reducedDamage2 урона")

        if (!(player1 as Health).isAlive()) {
            println("Игрок 1 пал!")
            break
        }

        round++
    }

    println("\nБой окончен!")
    if ((player1 as Health).isAlive()) {
        println("Победитель: Игрок 1 ($player1)")
    } else {
        println("Победитель: Игрок 2 ($player2)")
    }
}
