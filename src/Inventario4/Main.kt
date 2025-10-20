package Inventario4

fun main(){
    val player = Player("Aranthor", 15, 20)
    val sword = Epic(Mithril(BasicSword()))
    val bow = Rare(Steel(BasicBow()))
    println("${sword.name}: \n\tDamage: ${sword.damage} \n\tWeight: ${sword.weight}kg")
    player.pickUp(sword)
    println("${bow.name}: \n\tDamage: ${bow.damage} \n\tWeight: ${bow.weight}kg")
    player.pickUp(bow)

}