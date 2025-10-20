package Inventario4

class Mithril(private val weapon: IWeapon): IWeapon {
    override val damage: Double
        get() = weapon.damage * 1.2
    override val name: String
        get() = "Mithril ${weapon.name}"
    override val weight: Double
        get() = weapon.weight * 0.75
    override val slots: Int
        get() = weapon.slots
}