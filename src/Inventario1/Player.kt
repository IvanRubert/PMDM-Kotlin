package Inventario1

class Player(var name: String, val maxStrength: Int) {
    var currentLoad: Int = 0
    val backpack: ArrayList<Item> = ArrayList<Item>()

    fun getInfo(): String = "Name: $name, MaxStrength: $maxStrength"

    fun canAdd(weight: Int): Boolean = (currentLoad+weight) < maxStrength

    fun pickUp(item: Item) {
        if (canAdd(item.weight)){
            backpack.add(item)
            currentLoad += item.weight

            println("Added ${item.name} (+${item.weight}). Current load: $currentLoad/$maxStrength.")
        }else {
            val exceed = (currentLoad + item.weight) - maxStrength
            println("Cannot add ${item.name} (+${item.weight}). Exceeds by $exceed ($currentLoad/$maxStrength).")
        }
    }

    fun listBackpack(): String {
      var result: String = "Backpack: "
      backpack.forEach { item ->
          result += "${item.name}, "
      }

        result = result.trimEnd().removeSuffix(",")
        return result
    }
}