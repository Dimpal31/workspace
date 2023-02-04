class empty_arry {
}
fun main() {

    val arr = intArrayOf(1,2,0,4,5)



    println("Elements in Array: ")
    for(i in arr)
    {
        print(" $i")
        if (i.equals(0))
        {
            println("empty")

        }
        else
        {
            println("")

        }
    }
    println("")
}