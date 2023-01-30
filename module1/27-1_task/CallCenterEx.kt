fun main()
{
    println("Enter your choice")
    var num= readLine()!!.toInt()

    when(num)
    {
        1->
        {
            println("Your Selected Language is Gujarati")
        }
        2->
        {
            println("Your Selected Language is Hindi")
        }
        3->
        {
            println("Your Selected Language is English")
        }
    }
}