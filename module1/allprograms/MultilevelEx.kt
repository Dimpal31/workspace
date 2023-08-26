open class a1
{
    fun a1()
    {
        println("a1 Executed")
    }
}
open class a2 : a1()
{
    fun a2()
    {
        println("a2 Executed")
    }
}
class a3:a2()
{
    fun a3()
    {
        println("a3 Executed")
    }
}
fun main()
{
    var mydetail=a3()
    mydetail.a1()
    mydetail.a2()
    mydetail.a3()
}