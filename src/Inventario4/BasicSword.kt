package Inventario4

class BasicSword(): IWeapon {
    override val name: String = "Sword"
    override val weight: Double = 8.0
    override val slots: Int = 1
    override val damage: Double = 10.0
}