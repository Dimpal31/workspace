class ArrayExUserInput
{
    fun getdata()
    {
        var data=IntArray(5)

        for (i in 0..4)
        {
            println("enter your number for index : $i")
            var data2= readLine()!!.toInt()
            data[i]=data2
        }
        for (i in 0..4)
        {
            data[i]
            println(data[i])
        }

    }
}
fun main()
{
    var b1=ArrayExUserInput()
    b1.getdata()
}