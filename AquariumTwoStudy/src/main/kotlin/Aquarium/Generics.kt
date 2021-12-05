package Aquarium

// make class fit for any types
class MyList<T> {
    fun get(pos: Int): T {
        TODO("implement")
    }
    fun addItem(item: T) {}
}

fun workWithMyList() {
    val intList: MyList<Int>
    val fishList: MyList<Fish>
}