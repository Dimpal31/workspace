fun main()
{
    println("Enter Your Age")
    var age= readLine()!!.toInt()

    if (age>=18)
    {
       println("Eligible for vote")
        if (age>=60)
        {
            println("You are under senior citizen category")
        }
        else
        {
            println("You are under young category")
        }
    }
    else
    {
        println("Not Eligible for vote")
    }
}