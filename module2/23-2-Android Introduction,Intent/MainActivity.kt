package com.example.first_kotlin_app

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    lateinit var t1:TextView
    lateinit var t2:TextView
    lateinit var t3:TextView
    lateinit var t4:TextView
    lateinit var i1:ImageView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        t1=findViewById(R.id.txt1)
        t2=findViewById(R.id.txt2)
        t3=findViewById(R.id.txt3)
        t4=findViewById(R.id.txt4)
        i1=findViewById(R.id.img1)

        t1.setOnClickListener {
            Toast.makeText(applicationContext,"Text 1",Toast.LENGTH_LONG).show()

            var i=Intent(applicationContext,MainActivity2::class.java)
            startActivity(i)

        }

        t2.setOnClickListener {
            Toast.makeText(applicationContext,"Text 2",Toast.LENGTH_LONG).show()

        }

        t3.setOnClickListener {
            Toast.makeText(applicationContext,"Text 3",Toast.LENGTH_LONG).show()

        }

        t4.setOnClickListener {
            Toast.makeText(applicationContext,"Toast 4",Toast.LENGTH_LONG).show()

        }

        i1.setOnClickListener {
            Toast.makeText(applicationContext,"Image",Toast.LENGTH_LONG).show()

            var url="https://www.tops-int.com/it-training-rajkot"
            var i=Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)
        }
    }
}