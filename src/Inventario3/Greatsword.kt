package Inventario3

class Greatsword(): Weapon(12, 15, 2) {
    override val name: String = "Greatsword"
    override fun printCanUsed(player: Player): String {
        var message = "$name usable: "
        message += canBeUsedBy(player).toString()
        return message
    }

}