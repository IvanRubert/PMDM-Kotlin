package Inventario4

class Epic(private val weapon: IWeapon): IWeapon {
    override val damage: Double
        get() = weapon.damage * 1.3
    override val name: String
        get() = "Epic ${weapon.name}"
    override val weight: Double
        get() = weapon.weight
    override val slots: Int
        get() = weapon.slots
}