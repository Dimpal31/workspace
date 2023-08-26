class specific_position_array
{

    var a = IntArray(5)

    fun getdata() {

        for (i in 0..4) {
            println("enter index $i")
            a[i] = readLine()!!.toInt()

        }
    }

    fun add() {
        println("your array size is :" + a.size)
        println("enter position for add new value :")

        var j = readLine()!!.toInt()
        println("enter new value :")
        a[j] = readLine()!!.toInt()
        println("in array updated value is :"+a[j])
    }

    fun putdata() {

        for (i in 0..4) {
            println(" your array element $i :" + a[i])
        }
    }
    }

    fun main() {
        var t = specific_position_array()
        t.getdata()
        t.add()
        t.putdata()

    }


