package Aquarium

// 1. Extension Functions
// add extension functions to class without touching the source code
fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}

//fun String.hasSpaces() = find { it == ' ' } != null // alternative

fun extensionsExample() {
    "Does it have spaces?".hasSpaces() // true
}

open class AquariumPlant(val color: String, private val size: Int)
class GreenLeafyPlant(size: Int): AquariumPlant("Green", size)

fun AquariumPlant.isRed() = color == "Red"

//fun AquariumPlant.isBig = size > 50 // incorrect! extension function cannot access private values

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun staticExample() {
    val greenLeafyPlant = GreenLeafyPlant(50)
    greenLeafyPlant.print() // GreenLeafyPlant

    val aquariumPlant: AquariumPlant = greenLeafyPlant
    aquariumPlant.print() // AquariumPlant (because extension function is resolved statically)
}

// 2. Extension Properties
val AquariumPlant.isGreen: Boolean
    get() = color == "Green"

fun propertyExample() {
    val plant = AquariumPlant("Green", 50)
    plant.isGreen // true
}

// nullable receiver
fun AquariumPlant?.pull() {
    this?.apply { println("removing $this") }
}

fun nullableExample() {
    val plant: AquariumPlant? = null
    plant.pull() // ok
}