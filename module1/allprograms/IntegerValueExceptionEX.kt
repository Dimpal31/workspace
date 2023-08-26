class IntegerValueExceptionEX
{
    fun gatedata()
    {
        for (i in 1..9)
        {
            println(i)
            var i= readLine()!!.toInt()

            if (i<10 && i>40)
            {
                throw ArithmeticException(" entered  detail is not valid")

            //  println("you have entered wrong details")

            /* try
                {
                    println("you have entered  wrong details")
                   // throw  java.lang.Exception("ghhg")
                }
                catch (e:Exception)
                {
                    e.printStackTrace()
                }*/
            }
            else
            {
                println("done ")
            }
        }
    }
}
fun main()
{
    var d=IntegerValueExceptionEX()
    d.gatedata()
}