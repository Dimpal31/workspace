class LamdaFunctionEx
{
    fun addTwoNum(a:Int,b:Int,action:(Int)->Unit)
    {
        val sum=a+b
        action(sum)
    }
}
fun main()
{
    val my=LamdaFunctionEx()
    val myLamda:(Int)->Unit={s:Int-> println(s) }
    my.addTwoNum(6,5,myLamda)
}