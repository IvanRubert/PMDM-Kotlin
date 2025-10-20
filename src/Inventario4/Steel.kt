package Inventario4

class Steel(private val weapon: IWeapon): IWeapon {
    override val damage: Double
        get() = weapon.damage * 1.1
    override val name: String
        get() = "Steel ${weapon.name}"
    override val weight: Double
        get() = weapon.weight * 0.9
    override val slots: Int
        get() = weapon.slots
}