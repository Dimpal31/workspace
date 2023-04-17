package com.example.sharedpreference_kotlin

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreference_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        sharedPreferences=getSharedPreferences("SESSION",Context.MODE_PRIVATE)

        if(sharedPreferences.getBoolean("SESSION",false) && !sharedPreferences.getString("NAME","")!!.isEmpty())
        {
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }
        binding.btn1.setOnClickListener {

            var name=binding.edtname.text.toString()
            var pass=binding.edtpass.text.toString()

            var i=Intent(applicationContext,MainActivity2::class.java)

            var editor:SharedPreferences.Editor=sharedPreferences.edit()

            editor.putBoolean("SESSION",true)
            editor.putString("NAME",name)
            editor.putString("PASS",pass)
            editor.commit()
            startActivity(i)

        }
    }
}