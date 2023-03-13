package com.example.cafe_ex

import android.Manifest.permission.CALL_PHONE
import android.content.Intent
import android.content.pm.PackageManager.PERMISSION_GRANTED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.PopupMenu
import android.widget.TextView

class HomeActivity : AppCompatActivity()
{
    lateinit var t1:TextView
    lateinit var c1:CheckBox
    lateinit var c2:CheckBox
    lateinit var c3:CheckBox
    lateinit var b1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        t1=findViewById(R.id.txt1)
        c1=findViewById(R.id.chk1)
        c2=findViewById(R.id.chk2)
        c3=findViewById(R.id.chk3)
        b1=findViewById(R.id.btn1)


        t1.setOnClickListener {
            var popup=PopupMenu(applicationContext,t1)
        }

        b1.setOnClickListener {
            var amount=0
            var builder=StringBuilder("")
            builder.append("\n selected Items \n")

            if (c1.isChecked)
            {
                builder.append("\n Pizza @Rs.100 \n ")
                amount+=100
            }
            if (c2.isChecked)
            {
                builder.append("\n Burger @Rs70 \n")
                amount+=70
            }
            if (c3.isChecked)
            {
                builder.append("\n Coffee @Rs.120 \n")
                amount+=120
            }

            builder.append("\n Total : "+amount)

            var i=Intent(applicationContext,BillActivity::class.java)
            i.putExtra("BILL",builder.toString())
            startActivity(i)
        }

    }
}