package Inventario3

interface IPickable {
    val name: String get
    val weight: Int get
    val slots: Int get
    var stack:Int get set
    val maxStack: Int get
}