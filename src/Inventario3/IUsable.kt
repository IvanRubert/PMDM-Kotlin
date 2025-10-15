package Inventario3

interface IUsable {
    fun canBeUsedBy(player: Player): Boolean
    fun printCanUsed(player: Player): String
}