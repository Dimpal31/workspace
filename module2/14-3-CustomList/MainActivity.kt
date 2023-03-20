package com.example.customlist_ex2_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity()
{

    lateinit var listView: ListView
    lateinit var list: MutableList<model>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView=findViewById(R.id.list)
        list=ArrayList()

        list.add(model(R.drawable.l1,"Lion"))
        list.add(model(R.drawable.l2,"Tiger"))
        list.add(model(R.drawable.l3,"Monkey"))
        list.add(model(R.drawable.l4,"Elephant"))
        list.add(model(R.drawable.l5,"Dog"))

        var adapter=MyAdapter(applicationContext,list)
        listView.adapter=adapter

    }
}