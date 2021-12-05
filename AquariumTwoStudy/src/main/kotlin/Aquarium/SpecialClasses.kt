package Aquarium

object MobyDickWhale {
    val author = "Human Melville"

    fun jump() {
        // ...
    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

// must be subclassed in the same declared file
sealed class Seal

class Sealion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Sealion -> "sealion"
        is Walrus -> "walrus"
    }
}