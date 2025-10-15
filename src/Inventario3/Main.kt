package Inventario3

fun main(){
    val player = Player("Aranthor", 15, 20)
    val sword = Sword()
    val greatsword = Greatsword()
    val bow = Bow()
    val crossbow = Crossbow()
    val arrow = Arrow(stack = 10)
    val arrow2 = Arrow(stack = 10)
    val bolt = Bolt(stack = 10)
    player.pickUp(sword)
    player.pickUp(greatsword)
    player.pickUp(bow)
    player.pickUp(crossbow)
    println(sword.printCanUsed(player))
    println(greatsword.printCanUsed(player))
    println(bow.printCanUsed(player))
    player.pickUp(arrow)
    player.pickUp(arrow2)
    println(bow.printCanUsed(player))
    println(crossbow.printCanUsed(player))
    /*val potion = Potion()
    val key = Key()
    val scroll = Scroll()

    println(player.getInfo())
    player.pickUp(key)
    player.pickUp(scroll)
    player.pickUp(treasure)
    player.pickUp(potion)
    player.pickUp(sword)
    println(player.listBackpack())*/
}
