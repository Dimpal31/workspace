fun main()
{
    var s1 = Tops("Dimpal","dimpal@gmail.com")
    var s2 = Tops("Shruti","Shruti@gmail.com")

    s1.disply()
    s2.disply()

}

class Tops(var name: String,var email:String)
{
    fun disply()
    {
        println("enter your name $name")
        println("enter your gmail $email")
        println("====================")
    }
}
