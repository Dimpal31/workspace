package com.example.sharedpreference_kotlin

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity2 : AppCompatActivity()
{
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        sharedPreferences=getSharedPreferences("SESSION",Context.MODE_PRIVATE)

            Toast.makeText(applicationContext,"Welcome "+sharedPreferences.getString("NAME","Xyz"),Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.i1->
            {
                sharedPreferences.edit().clear().commit()
                startActivity(Intent(applicationContext,MainActivity::class.java))

            }
        }
        return super.onOptionsItemSelected(item)
    }
}