fun add2():Int
{
    println("enter value for a : ")
    var a= readLine()!!.toInt()

    println("enter value for b : ")
    var b= readLine()!!.toInt()

    var c=a+b
    return c
}
fun main()
{
    println(add2())
}