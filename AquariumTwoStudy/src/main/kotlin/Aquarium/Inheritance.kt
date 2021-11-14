package Aquarium

//// use interface when need to create many methods
//interface AquariumAction {
//    fun eat()
//    fun jump()
//    fun clean()
//    fun catchFish()
//    fun swim() {
//        println("swim")
//    }
//}
//
//interface FishAction {
//    fun eat()
//}
//
//abstract class AquariumFish: FishAction {
//    abstract val color: String
//    override fun eat() = println("yum")
//}

fun main(args: Array<String>) {
    delegate()
}

private fun delegate() {
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("a lot of algae"),
    FishColor by fishColor

// singleton pattern
object GoldColor: FishColor {
    override val color = "gold"
}

object RedColor: FishColor {
    override val color = "red"
}

class PrintingFishAction(private val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}