class myFirstClass
{
    fun haspassed(marks:Int):Boolean
    {
        return marks>35
    }
}
fun main()
{
    var m1=myFirstClass()
    println("Pass status : "+m1.haspassed(95))
    println("Scholarship status : "+m1.isscholar(95))
}
fun myFirstClass.isscholar(marks: Int):Boolean
{
    return marks>90
}