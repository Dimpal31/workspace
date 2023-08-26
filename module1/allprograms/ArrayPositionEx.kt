class ArrayPositionEx
{
    var i=1
    var a= IntArray(5)
  //  var num=1

    fun getdata()
    {

        for (i in 0..4)
        {
            println("enter index $i")
            a[i]= readLine()!!.toInt()

        }
    }
    fun find()
    {
        println("enter position ")
        i= readLine()!!.toInt()
        println("element is : " + a[i])
    }
}
fun main()
{
    var b = ArrayPositionEx()
    b.getdata()
    b.find()
}