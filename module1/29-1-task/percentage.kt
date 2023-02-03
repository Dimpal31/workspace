fun main()
{
    println("enter subject 1 marks : ")
    var sub1= readLine()!!.toFloat()

    println("enter subject 2 marks : ")
    var sub2= readLine()!!.toFloat()

    println("enter subject 3 marks : ")
    var sub3= readLine()!!.toFloat()

    println("enter subject 4 marks : ")
    var sub4= readLine()!!.toFloat()

    println("enter subject 5 marks : ")
    var sub5= readLine()!!.toFloat()

    var percentage=(sub1+sub2+sub3+sub4+sub5)*100/500
    println("Your result is $percentage")
}