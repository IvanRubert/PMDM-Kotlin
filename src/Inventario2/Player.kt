package Inventario2

class Player(var name: String, val maxStrength: Int) {
    var currentLoad: Int = 0
    val backpack: ArrayList<IPickable> = ArrayList<IPickable>()

    fun getInfo(): String = "Name: $name, MaxStrength: $maxStrength"

    fun canAdd(item: IPickable): Boolean = (currentLoad+item.weight) < maxStrength

    fun pickUp(item: IPickable) {
        if (canAdd(item)){
            backpack.add(item)
            currentLoad += item.weight

            println("Added ${item.name} (+${item.weight}). Current load: $currentLoad/$maxStrength.")
        }else {
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