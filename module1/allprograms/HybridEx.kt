open class g
{
    fun g1()
    {
        println("g1 Executed")
    }
}
interface h
{
    fun h1()
    {
        println("h1 Executed")
    }
}
open class i:g(),h
{
    fun i1()
    {
        println("i1 Executed")
    }
}
class j:i()
{
    fun j1()
    {
        println("j1 Executed")
    }
}
fun main()
{
    var t=g()
    t.g1()


}