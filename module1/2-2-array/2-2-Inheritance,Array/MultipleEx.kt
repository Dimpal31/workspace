 interface d
{
    fun d()
    {
        println("d Executed")
    }
}
interface e
{
    fun e()
    {
        println("e Executed")
    }

}
class f:d,e
{
    fun f()
    {
        println("f Executed")
    }

}
 fun main()
 {
     var y=f()
     y.d()
     y.e()
     y.f()
 }