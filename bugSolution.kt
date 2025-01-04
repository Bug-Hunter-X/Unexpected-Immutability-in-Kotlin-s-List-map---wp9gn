fun main() {
    val list = listOf(1, 2, 3, 4, 5).toMutableList() //Convert list to mutable list
    list.mapInPlace { it * 2 } //Now modify the list in place using mapInPlace, requires adding the custom extension function
    println(list) // Output: [2, 4, 6, 8, 10]
}

fun <T> MutableList<T>.mapInPlace(transform: (T) -> T): Unit{
    for (i in indices){
        this[i] = transform(this[i])
    }
}
