package Inventario3

abstract class Weapon(override val weight: Int, val damage: Int, override val slots: Int,
                      override var stack: Int = 1, override val maxStack: Int = 1,
                      private val canUseCondition: (Player) -> Boolean = {true}): IPickable, IUsable {


    override fun canBeUsedBy(player: Player): Boolean{
        return canUseCondition(player)
    }
}