package KotlinBasico

const val ROCKS = 3

/*
Correct
val value1 = complexFunctionCall()
Not Correct
const val CONSTANT1 = complexFunctionCall()
*/

object Constants {
    const val CONSTANT2 = "object constant"
}

val foo = Constants.CONSTANT2

class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

fun String.hasSpaces(): Boolean {
    val found = this.indexOf(' ')
    return found != -1
}

fun String.hasSpaces2() = indexOf(' ') != -1

val text = "hola"
val textSpace = "Hola mundo"

fun main() {
    println(text.hasSpaces())
    println(text.hasSpaces2())
    println(textSpace.hasSpaces())
    println(textSpace.hasSpaces2())
}