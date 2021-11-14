package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

private fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length} cm, " +
            "Height: ${myAquarium.height} cm, " +
            "Width: ${myAquarium.width} cm")
    myAquarium.height = 80
    println("Length: ${myAquarium.length} cm")
    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium Volume: ${smallAquarium.volume} liters")
}

private fun feedFish(fish: FishAction) {
    fish.eat()
}

private fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}\nPlecostomus: ${pleco.color}")

    feedFish(shark)
    feedFish(pleco)
}