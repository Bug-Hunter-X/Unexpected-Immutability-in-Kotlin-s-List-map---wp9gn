fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 } //This will create a new list instead of modifying the original list
    println(list) // Output: [1, 2, 3, 4, 5]
    println(result) // Output: [2, 4, 6, 8, 10]
}