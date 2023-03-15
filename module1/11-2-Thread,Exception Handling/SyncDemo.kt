class Sender
{
    fun send(msg:String)
    {
        println("sending $msg")
        Thread.sleep(2000)
        println("$msg sent")
    }
}
class Threadsend(var msg: String,var sender: Sender):Thread()
{
    override fun run()
    {
      //  Synchronized(Sender)
        {
       //   Sender.send(msg)
        }

    }
}
fun main()
{
    var sender=Sender()
    var t1=Threadsend("hii",sender)
    var t2=Threadsend("bye",sender)
    t1.start()
    t2.start()
}