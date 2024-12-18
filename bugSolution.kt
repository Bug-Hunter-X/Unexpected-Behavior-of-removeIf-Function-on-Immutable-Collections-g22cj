fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it <= 2 }
    println(list) // Output: [1, 2, 3, 4, 5] (Original list unchanged)
    println(newList) // Output: [1, 2] (New filtered list)

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val newSet = set.filter { it <= 2 }
    println(set) // Output: [1, 2, 3, 4, 5] (Original set unchanged)
    println(newSet) // Output: [1, 2] (New filtered set)

    // Alternatively, create a copy before modifying:
    val list2 = mutableListOf(1,2,3,4,5)
    val listCopy = list2.toMutableList()
    listCopy.removeIf { it > 2 }
    println(list2) // Original list unchanged
    println(listCopy) // Modified copy
}