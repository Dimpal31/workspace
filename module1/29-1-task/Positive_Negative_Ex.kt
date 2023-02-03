fun main()
{
    println("Enter tour number")
    var number= readLine()!!.toInt()

    if (number>0)
    {
        println("Your number is positive")
    }
    else if (number<0)
    {
        println("Your number is negative")
    }
    else
    {
        println("Zero")

    }
}