package Inventario3

class Sword(): Weapon(8, 10, 1) {
    override val name: String = "Sword"
    override fun printCanUsed(player: Player): String {
        var message = "$name usable: "
        message += canBeUsedBy(player).toString()
        return message
    }
}