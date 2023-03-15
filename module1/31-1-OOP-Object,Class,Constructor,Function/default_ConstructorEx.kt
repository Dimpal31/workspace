class default_ConstructorEx(var n1:Int,var n2:Int)
{
    fun getdata()
    {
        println("enter any number")
        n1= readLine()!!.toInt()
        println("enter any number")
        n2= readLine()!!.toInt()


    }
    fun disply()
    {
        var n3=n1*n2
        println(n3)
    }

}
fun main()
{
    var b1=default_ConstructorEx(1,2)
    b1.getdata()
    b1.disply()
}