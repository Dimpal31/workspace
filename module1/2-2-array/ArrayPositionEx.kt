import java.awt.CheckboxMenuItem

class ArrayPositionEx
{
    fun gatedata()
    {
        var array = IntArray(5)
       /* array[0]=10
        array[1]=20
        array[2]=30
        array[3]=40
        array[5]=50*/

        for (i in array)
        {
            println(i)

        }
    }
    fun findIndex(array: IntArray,item:Int):Int
    {
        return array.indexOf(item)
        println(findIndex(array, item))
    }

}

fun main()
{
    var b1=ArrayExUserInput()
    b1.getdata()




}




/*
fun findIndex(arr: Array<Int>, item: Int): Int
{
    return arr.indexOf(item)
}

fun main()
{
    var arr = arrayOf(1, 2, 3, 4, 5)
    var item = 0

    println(findIndex(arr, item))
}
*/
