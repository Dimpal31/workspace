fun main()
{
    println("Enter Your Marks ")
    var marks = readLine()!!.toInt()

    if (marks>=70)
    {
        println("A Grade")
    }
    else if (marks>=60)
    {
        println("B Grade")
    }
    else if (marks>=50)
    {
        println("C Grade")
    }
    else if (marks>=40)
    {
        println("D Grade")
    }
    else
    {
        println("fail")
    }
}