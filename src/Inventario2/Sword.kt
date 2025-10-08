package Inventario2

class Sword: IPickable {
    override val name: String
        get() = "Sword"
    override val weight: Int
        get() = 10
}