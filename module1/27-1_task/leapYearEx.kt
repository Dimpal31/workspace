fun main()
{
    println("enter your year")
    var year= readLine()!!.toInt()

    if (year%4==0)
    {
        println("year is leap year")

    }
    else
    {
        println("year is not leap year")

    }
}