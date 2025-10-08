package Inventario2

class Key: IPickable {
    override val name: String
        get() = "Key"
    override val weight: Int
        get() = 1
}