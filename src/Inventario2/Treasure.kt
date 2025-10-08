package Inventario2

class Treasure: IPickable {
    override val name: String
        get() = "Treasure"
    override val weight: Int
        get() = 10
}