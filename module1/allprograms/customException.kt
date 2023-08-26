class customException
{
    fun check(amount:Int)
    {
        if (amount>2000)
        {
            var c=amount-2000
            println("you need more $c")
            throw ArithmeticException("you have not sufficient balance")
        }
        else
        {

            println("Transaction done")

        }
    }
}
fun main()
{
    var c1=customException()
    c1.check(3500)
}