class ArrayWhileLoopEx
{
    fun gatetada()
    {
        var i = 1
        var data=IntArray(5)

        while (i<=5)
        {
            println("enter your number for index : $i")
            i++
             data[i]= readLine()!!.toInt()

        }
    }

}
fun main()
{
    var b1=ArrayExUserInput()
    b1.getdata()
}
