package com.example.gridview_ex_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.ListView

class MainActivity : AppCompatActivity()
{
    lateinit var gridView: GridView
    //  lateinit var listView: ListView
    lateinit var list: MutableList<model>


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView=findViewById(R.id.list)
        list=ArrayList()

        list.add(model(R.drawable.g1,"Coffee"))
        list.add(model(R.drawable.g2,"French Fries"))
        list.add(model(R.drawable.g3,"Honey"))
        list.add(model(R.drawable.g4,"Ice-Cream"))
        list.add(model(R.drawable.g5,"Pizza"))
        list.add(model(R.drawable.g7,"Burger"))
        list.add(model(R.drawable.g1,"Coffee"))
        list.add(model(R.drawable.g2,"French Fries"))
        list.add(model(R.drawable.g3,"Honey"))
        list.add(model(R.drawable.g4,"Ice-Cream"))
        list.add(model(R.drawable.g5,"Pizza"))
        list.add(model(R.drawable.g7,"Burger"))
        list.add(model(R.drawable.g1,"Coffee"))
        list.add(model(R.drawable.g2,"French Fries"))
        list.add(model(R.drawable.g3,"Honey"))
        list.add(model(R.drawable.g4,"Ice-Cream"))
        list.add(model(R.drawable.g5,"Pizza"))
        list.add(model(R.drawable.g7,"Burger"))

        var adapter=MyAdapter(applicationContext,list)
        gridView.adapter=adapter

    }
}