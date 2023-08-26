fun main()
{
    var first=1.20f
    var second=2.45f

        println("--Before swap")
        println("First number=$first")
        println("second number=$second")

        var temporary=first
        first=second
        second=temporary

    println("------------------------------------")
    println("--After swap--")
    println("First number = $first")
    println("Second number = $second")


}