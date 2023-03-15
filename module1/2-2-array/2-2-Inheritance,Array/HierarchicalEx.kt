open class bank
{
    fun bank()
    {
        println("Banking")
    }
}
class Current:bank()
{
    fun Current()
    {
        println("Current")
    }
}
class save:bank()
{
    fun save()
    {
        println("Saving")
    }

}
fun main()
{
    var c1=Current()
    var s1=save()


    c1.Current()
    s1.save()
    s1.bank()

}
