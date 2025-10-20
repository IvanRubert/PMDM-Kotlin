package Inventario4

class Rare(private val weapon: IWeapon): IWeapon {
    override val damage: Double
        get() = weapon.damage * 1.15
    override val name: String
        get() = "Rare ${weapon.name}"
    override val weight: Double
        get() = weapon.weight
    override val slots: Int
        get() = weapon.slots
}