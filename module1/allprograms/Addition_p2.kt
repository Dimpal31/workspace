import kotlin.math.cbrt

fun main()
{
    val num = 10

    val sum = addNumbers(num)
    println("Sum = $sum")
}
fun addNumbers(num:Int):Int
{
    if (num != 0)
        return num + addNumbers(num - 1)
    else
    return num
}


