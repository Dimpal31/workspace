class Student ()
{
    var name =""
    var gmail=""

    fun disply()
    {
        println("enter your name $name")
        println("enter your gmail $gmail")
        println("=========")
    }
}

fun main()
{
    var s1 = Student()
    s1.name="dimpal"
    s1.gmail="dimpal@gmail.com"

    var s2=Student()
    s2.name="Shruti"
    s2.gmail="shruti@gmail.com"

    var s3=Student()
    s3.name="nikunj"
    s3.gmail="nikunj@gmail.com"

    var s4=Student()
    s4.name="Raj"
    s4.gmail="raj@gmail.com"

    s1.disply()

    s2.disply()

    s3.disply()

    s4.disply()
}