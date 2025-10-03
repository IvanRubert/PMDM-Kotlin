package Inventario1

fun main(){
    val player = Player("Aranthor", 20)
    val sword = Item("Sword", 10)
    val potion = Item("Potion", 3)
    val treasure = Item("Treasure", 15)

    println(player.getInfo())
    player.pickUp(sword)
    player.pickUp(potion)
    player.pickUp(treasure)
    println(player.listBackpack())
}