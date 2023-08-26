open class bank8
{
    open fun rate():Int
    {
        return 0
    }
}
class Sbi:bank8()
{
    override fun rate():Int
    {
        return 7
    }
}
class Icici: bank8()

{
    override fun rate():Int
    {
        return 8
    }
}
class Axis:bank8()
{
    override fun rate(): Int
    {
        return 9
    }
}
fun main()
{
    var b=bank8()
    b=Sbi()
    println(b.rate())
    b=Icici()
    println(b.rate())
    b=Axis()
    println(b.rate())



}