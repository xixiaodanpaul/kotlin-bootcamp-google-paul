package Aquarium

const val rocks = 3
val number = 5
const val num = 5

// function return type
fun complexFunctionCall() {}

val result = complexFunctionCall()

//const val result = complexFunctionCall() // incorrect! const val cannot be used as return type

const val CONSTANT = "top-level constant"

// constant in object
object Constants {
    const val CONSTANT2 = "object constant"
}

val foo = Constants.CONSTANT2

// to use constant in class - wrap in companion object
class MyClass {
    companion object {
        const val CONSTANT3 = "constant inside companion"
    }
}