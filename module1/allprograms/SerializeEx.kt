import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class SerializeEx
{
    fun s1()
    {
        var s1=Student8(101,"tops")
        var font= FileOutputStream("D://file_input.txt")
        var out=ObjectOutputStream(font)
        out.writeObject(s1)
        println("success")
    }
}
fun main()
{
    var s = SerializeEx()
    s.s1()
}