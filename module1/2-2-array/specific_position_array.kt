class specific_position_array {
}
    fun main() {

        val arr = intArrayOf(1,2,3,4,5)

        arr[4] = 10     // Trying to add an item at index = 5, Exception Occurred

        println("Elements in Array: ")

        // Traverse using for loop
        for(element in arr)
        {
            print(" $element")
        }
        println("")
    }

