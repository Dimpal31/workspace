class Marks()
{
    var marks=IntArray(5)
    var s=0

    fun getdata() {


        for (i in 0..4) {
            println("enter your number for index : $i")
            marks[i] = readLine()!!.toInt()

            s += marks[i]
        }
    }
    fun sum()
    {
        var per=s/5
    }
}
fun main()
{
    var b1=Marks()
    b1.getdata()
}