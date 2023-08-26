class InfixFunctionEx
{
    fun haspassed(marks:Int):Boolean
    {
        return marks>35
    }
}
fun main()
{
    var m2=InfixFunctionEx()
    println("Pass Status :"+m2.haspassed(95))
    println("Scholarship Status: "+m2.isscholar(95))
}
infix fun InfixFunctionEx.isscholar(marks: Int):Boolean
{
    return marks>90
}