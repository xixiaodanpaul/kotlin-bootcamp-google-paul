package Aquarium

import kotlin.math.PI

open class Aquarium(var length: Int = 100,
               var width: Int = 20,
               var height: Int = 40) {

//    fun volume(): Int {
//        return width * height * length / 1000
//    }

//    fun volume() = width * height * length / 1000

//    val volume: Int
//        get() {
//            return width * height * length / 1000
//        }

    open var volume: Int
        get() = length * width * height / 1000
        set(value) { height = (value * 1000) / (length * width) }

    open val water = volume * 0.9

    constructor(numberOfFish: Int): this() {
        val water: Int = numberOfFish * 2000 // cm3
        val tank: Double = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }
}

class TowerTank() : Aquarium() {
    override var water = volume * 0.8
    override var volume: Int
        get() = (width * height * length / 1000 * PI).toInt()
        set(value) { height = (value * 1000) / (length * width) }
}