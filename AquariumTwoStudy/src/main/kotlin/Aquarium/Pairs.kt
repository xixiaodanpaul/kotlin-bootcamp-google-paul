package Aquarium

fun main(args: Array<String>) {
    val equipment = "fish net" to "catching fish"

    println(equipment.first)
    println(equipment.second)

    val equipment2 = "fish net" to "catching fish" to "of big size" to "and strong"
    println(equipment2)

    val equipment3 = ("fish net" to "catching fish") to ("of big size" to "and strong")
    println(equipment3)

    val (tool, use) = equipment
    println("The $tool is a tool for $use")

    val equipString = equipment.toString()
    val equipList = equipment.toList()
    println(equipString)
    println(equipList)

    val (tool2, use2) = giveMeATool()
    println("The $tool2 is a tool for $use2")
}

fun giveMeATool(): Pair<String, String> {
    return ("fish net" to "catching fish")
}