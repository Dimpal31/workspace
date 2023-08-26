import java.io.FileInputStream
import java.io.FileReader

fun main()
{
   /* var fin=FileInputStream("D://file_input.txt")
    var byteArray:ByteArray= ByteArray(fin.available())
    fin.read(byteArray)
    var str:String=String(byteArray)
    println(str)*/


    FileReader("D://file_input.txt").use()
    {

    }
}