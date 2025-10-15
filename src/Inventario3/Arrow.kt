package Inventario3

class Arrow(override var stack: Int): IPickable {
    override val name: String = "Arrow"
    override val weight: Int = 1
    override val slots: Int = 1
    override val maxStack: Int = 64
}