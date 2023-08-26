class BankEx
{
    constructor(n1:Int,n2:Int)
    {
        println("Your Fixed deposit is executed for 2 years")
    }
    constructor(n1: Int,n2: Int,n3:Int)
    {
        println("Your Fixed deposit is executed for 3 years")
    }
    constructor(n1: Int,n2: Int,n3: Int,n4:Int)
    {
        println("Your Fixed deposit is executed for 4 years")
    }

}
fun main()
{
    var b1=BankEx(2023,2024,2025)
}