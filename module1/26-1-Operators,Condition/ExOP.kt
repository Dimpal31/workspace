fun main()
{
    /*  var a= 5
        var b=6//assign
        println(b==a)//comapre
*/
    //Not Equal To

    //var email ="a@gmail.com"

    println("Enter Your Email")
    var email= readlnOrNull()

    /* if(email!!.equals("prakruti@gmail.com"))
        {
            println("Already Exist")
        }
        else
        {
            println("Registration Done")
        }*/

    if (email!="prakruti@gmail.com")
    {
        println("Registration Done")
    }
    else
    {
        println("Already Exit")
    }
}