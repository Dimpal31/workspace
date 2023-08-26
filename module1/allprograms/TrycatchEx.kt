class CheckData
{
    fun details()
    {
        try
        {
            var num=25/0
            println(num)

        }
        catch (e:Exception)
        {
            e.printStackTrace()
        }
        finally {
            println("Executed")
        }
    }
}
fun main()
{
    var dt=CheckData()
    dt.details()
}