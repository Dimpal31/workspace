class Student2()
{
    var name=""
    var gmail=""

    fun getdata()
    {
        println("enter your name")
        name= readLine().toString()

        println("enter your gmail")
        gmail= readLine().toString()
    }

    fun disply()
    {
        println("enter your name $name")
        println("enter your gmail $gmail")
    }
}
fun main()
{
    var s1=Student2()
    s1.getdata()

    var s2=Student2()
    s2.getdata()


    s1.disply()
    s2.disply()
}