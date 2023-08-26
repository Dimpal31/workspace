class Sc ()
{
    var num =1
    var square=1
    var cube =1

    fun getdata()
    {
        println("enter any number")
        num= readLine()!!.toInt()
        square=num*num
        cube=num*num*num

      //  println("$square")
        //println("$cube")
    }
    fun disply()
    {
        println(square)
        println(cube)
    }
}
fun main()
{
    var s1=Sc()
    s1.getdata()
    s1.disply()

    var s2=Sc()
    s2.getdata()
    s2.disply()
}