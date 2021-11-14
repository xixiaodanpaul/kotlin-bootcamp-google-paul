package Aquarium

fun main(args: Array<String>) {
    fishExample()
}

fun fishExample() {
    val firstFish = Fish(friendly = false, volumeNeeded = 20)
    println("Is first fish friendly? ${firstFish.friendly}. It needs volume ${firstFish.size}")

    val secondFish = Fish()
    println("Is second fish friendly? ${secondFish.friendly}. It needs volume ${secondFish.size}")
}

class Fish(val friendly: Boolean = true, val volumeNeeded: Int) {
    val size: Int

    init {
        println("first init block")
    }

    init {
        size = if (friendly) volumeNeeded else volumeNeeded * 2
        println("init size = $size")
    }

    constructor(): this(friendly = true, volumeNeeded = 9) {
        println("running secondary constructor")
    }

    init {
        println("second init block")
    }
}