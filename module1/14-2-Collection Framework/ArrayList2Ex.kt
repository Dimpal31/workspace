class MyList
{
    fun execution()
    {
        var list= ArrayList<String>()
        list.add("Kotlin")
        list.add("Java")
        list.add("Php")

        var list2=ArrayList<String>()
        list2.add("Android")
        list2.add("Flutter")
        list2.add("Php")

     //   list.addAll(list2)

        list.retainAll(list2)

     //   list.remove("Php")
      //  list.removeAt(2)


      //  list.removeAll(list2)

      //  println(list)

        var iterator:Iterator<String> = list.iterator()

        while (iterator.hasNext())
        {
            println(iterator.next())
        }
      //  println(list)
    }
}
fun main()
{
    var m=MyList()
    m.execution()
}