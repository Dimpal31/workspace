class NamedFunctionEx(var firstname:String,var lastname:String,var email:String,var phone:String,var city:String,var district:String,var age:Int,var school:String)
{
    fun details()
    {
        println("Your Firstname is $firstname")
        println("Your lastname is $lastname")
        println("Your email is $email")
        println("Your phone is $phone")
        println("Your city is $city")
        println("Your district is $district")
        println("Your age is $age")
        println("Your school is $school")
    }
}