package com.example.cafe_ex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity()
{
    lateinit var edt1:EditText
    lateinit var edt2:EditText
    lateinit var btn1:Button


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edt1=findViewById(R.id.edtmobile)
        edt2=findViewById(R.id.edtpass)
        btn1=findViewById(R.id.btnlogin)

        btn1.setOnClickListener {

            var mob=edt1.text.toString()
            var pass=edt2.text.toString()

            if (mob.equals("1234567890") && pass.equals("1234"))
            {
                startActivity(Intent(applicationContext,HomeActivity::class.java))
            }
            else
            {
                Toast.makeText(applicationContext,"login fail",Toast.LENGTH_LONG).show()
            }
        }
    }
}