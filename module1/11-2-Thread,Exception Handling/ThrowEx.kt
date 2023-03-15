class ThrowEx
{
    fun check(age:Int)
    {
        if (age<18)
        {
            throw ArithmeticException("Age is not valid")
        }
        else
        {
            println("Eligible to vote")
        }
    }
}
fun main()
{
    var t1=ThrowEx()
    t1.check(15)
}