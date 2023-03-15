class BanksOperatingSystem
{
    fun acc_deteils()
    {
        println("enter your name")
        var name= readLine().toString()

        println("enter acc_no")
        var acc_no= readLine().toString()
    }
}
class Account {


    fun acc() {
        println("enter amount")
        var amount = readLine()!!.toInt()
        if (amount >= 25000) {
            println("your bak is SBI")
            var a = amount / 100 * 4
            println("interest is $a")
        } else if (amount >= 50000) {
            println("your bak is ICICI")
            var b = amount / 100 * 5
            println("interest is $b")

        } else if (amount >= 75000) {
            println("your bak is PNB")
            var c = amount / 100 * 6
            println("interest is $c")

        }
    }
}

    open class RBI {
        var min_bal = 1000
        var max_withdraw = 1000000
        var min_r = 4.0


    }


    class SBI : RBI() {

    }

    class ICICI : RBI() {


    }

    class PNB : RBI() {

    }

    fun main()
    {
        var a = BanksOperatingSystem()
        a.acc_deteils()

        var a1=Account()
        a1.acc()


        var r = RBI()
        var sbi = SBI()
        var icici = ICICI()
        var pnb = PNB()

    }
