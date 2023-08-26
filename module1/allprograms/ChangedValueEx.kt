class ChangedValueEx(var n1:Int,var n2:Int)
{
    fun getdata()
    {
        var n3=n1+n2
        println(n3)
    }
}
fun main()
{
    var a1=ChangedValueEx(2,3)
    a1.getdata()

    var a2=ChangedValueEx(5,3)
    a2.getdata()
}