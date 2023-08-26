import java.io.FileInputStream
import java.io.ObjectInputStream

class DeserializeEx
{
    fun d1()
    {
        var oin=ObjectInputStream(FileInputStream("D://file_input.txt"))

        var s:Student8=oin.readObject() as Student8

        println(s.id)
        println(s.name)
    }
}

fun main()
{
    var d=DeserializeEx()
    d.d1()
}
