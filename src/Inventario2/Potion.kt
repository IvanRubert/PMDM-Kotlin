package Inventario2

class Potion: IPickable {
    override val name: String
        get() = "Potion"
    override val weight: Int
        get() = 4
}