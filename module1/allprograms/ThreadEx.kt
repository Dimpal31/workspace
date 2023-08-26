class T2:Thread()
{
    override fun run() {
        for (i in 1..10)
        {
         println("Thread A : $i")
        }
    }
}
class T3:Thread()
{
    override fun run()
    {
        for (i in 1..10)
        {
            println("Thread B : $i")
        }
    }
}
fun main()
{
    var t1=T2()
    var t11=T3()

    t1.start()
    t11.start()
}