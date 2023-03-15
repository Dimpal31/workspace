fun main()
{


    for (i in 1..5)
    {
        var counter =i

        for(j in 1..i)
        {
            print("$counter ")
            counter = counter + 1
        }
        println()
    }

}