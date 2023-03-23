package com.example.fragment_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    lateinit var edt1:EditText
    lateinit var btn1:Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt1=findViewById(R.id.edt1)
        btn1=findViewById(R.id.btn1)

        btn1.setOnClickListener {


            var n=NameFragment()
            var fm=supportFragmentManager
            var ft=fm.beginTransaction()
            ft.replace(R.id.frmid,n).commit()


        }
    }
}