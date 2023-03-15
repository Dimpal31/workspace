import java.io.FileOutputStream

fun main()
{
    val put="hellow world"
    val gate=FileOutputStream("D://file_input.txt")
    gate.write(put.toByteArray())
    println("success")

}