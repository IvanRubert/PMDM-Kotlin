package Inventario3

class Crossbow(): Weapon(5, 8, 1, canUseCondition = {p -> p.backpack.any { it.name == "Bolt" }}) {
    override val name: String = "Crossbow"

    override fun printCanUsed(player: Player): String{
        var message = "$name usable: "
        message += if (canBeUsedBy(player)){
            "true"
        }else "false (no bolts)"
        return message
    }
}