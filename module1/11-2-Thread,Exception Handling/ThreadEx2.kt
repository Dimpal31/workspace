class TH:Runnable
{
    override fun run()
    {
        for (i in 1..10)
        {
            println("Thread A : $i")
        }
    }
}
class TH2:Runnable
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
    var th=TH()
    var th2=TH2()

  //  th.start()
}