package Inventario4

import kotlin.collections.any

class Player(var name: String, val maxStrength: Int, val slotCapacity: Int) {
    var currentLoad: Double = 0.0
    var currentSlots: Int = 0
    val backpack: ArrayList<IPickable> = ArrayList<IPickable>()

    fun getInfo(): String = "Name: $name, MaxStrength: $maxStrength, Slot capacity: $slotCapacity"

    fun canAdd(item: IPickable): Boolean =
        ((currentLoad + item.weight) < maxStrength && (currentSlots + item.slots) < slotCapacity)

    fun pickUp(item: IPickable) {

        if (canAdd(item)) {
            backpack.add(item)
            currentLoad += item.weight
            currentSlots += item.slots

            println("Added ${item.name} (+${item.weight}kg, +${item.slots} slots). Current load: $currentLoad/$maxStrength. Current slots: $currentSlots/$slotCapacity")
        } else {
            val exceed = (currentLoad + item.weight) - maxStrength
            println("Cannot add ${item.name} (+${item.weight}). Exceeds by $exceed ($currentLoad/$maxStrength).")
        }
    }

    fun listBackpack(): String {
        var result = "Backpack: "
        backpack.forEach { item ->
            result += "${item.name}, "
        }

        result = result.trimEnd().removeSuffix(",")
        return result
    }
}