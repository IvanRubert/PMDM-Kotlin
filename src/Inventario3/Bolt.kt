package Inventario3

class Bolt(override var stack: Int): IPickable {
    override val name: String = "Bolt"
    override val weight: Int = 1
    override val slots: Int = 1
    override val maxStack: Int = 64
}