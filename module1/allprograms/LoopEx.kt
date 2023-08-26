class LoopEx
{
    var num=1
    var square=1
    var cube=1

    fun getdata()
    {
        for (i in 5..50)
        {
            square=i*i
            cube=i*i*i

            println("square of $i is $square")
            println("cube of $i is $cube")
            println("=========================")

        }
    }
}
fun main()
{
    var s1=LoopEx()
    s1.getdata()
}