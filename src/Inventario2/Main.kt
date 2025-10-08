package Inventario2

fun main(){
    val player = Player("Aranthor", 15)
    val sword = Sword()
    val potion = Potion()
    val treasure = Treasure()
    val key = Key()
    val scroll = Scroll()

    println(player.getInfo())
    player.pickUp(key)
    player.pickUp(scroll)
    player.pickUp(treasure)
    player.pickUp(potion)
    player.pickUp(sword)
    println(player.listBackpack())
}