package Inventario3

class Bow(): Weapon(5, 8, 1, canUseCondition = {p -> p.backpack.any { it.name == "Arrow" }}) {
    override val name: String = "Bow"

    override fun printCanUsed(player: Player): String{
        var message = "$name usable: "
        message += if (canBeUsedBy(player)){
            "true"
        }else "false (no arrows)"
        return message
    }
}