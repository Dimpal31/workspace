package com.example.call_sms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class radio_button_Checkbox : AppCompatActivity()
{
    lateinit var t1:TextView
    lateinit var t2:TextView
    lateinit var chk1:CheckBox
    lateinit var chk2:CheckBox
    lateinit var chk3:CheckBox
    lateinit var chk4:CheckBox
    lateinit var chk5:CheckBox
    lateinit var chk6:CheckBox
    lateinit var rb1:RadioButton
    lateinit var rb2:RadioButton
    lateinit var rg:RadioGroup
    lateinit var btn1:Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button_checkbox)

        t1=findViewById(R.id.t1)
        t2=findViewById(R.id.t2)
        rb1=findViewById(R.id.rb1)
        rb2=findViewById(R.id.rb2)
        rg=findViewById(R.id.rg)
        chk1=findViewById(R.id.chk1)
        chk2=findViewById(R.id.chk2)
        chk3=findViewById(R.id.chk3)
        chk4=findViewById(R.id.chk4)
        chk5=findViewById(R.id.chk5)
        chk6=findViewById(R.id.chk6)
        btn1=findViewById(R.id.btn1)


        chk1.setOnCheckedChangeListener { button, b ->
            Toast.makeText(applicationContext,"Redding",Toast.LENGTH_SHORT).show()
        }

        chk2.setOnCheckedChangeListener { button, b ->
            Toast.makeText(applicationContext,"Music",Toast.LENGTH_SHORT).show()
        }

        chk3.setOnCheckedChangeListener { button, b ->
            Toast.makeText(applicationContext,"Dancing",Toast.LENGTH_SHORT).show()
        }

        chk4.setOnCheckedChangeListener { button, b ->
            Toast.makeText(applicationContext,"Video Games",Toast.LENGTH_SHORT).show()
        }

        chk5.setOnCheckedChangeListener { button, b ->
            Toast.makeText(applicationContext,"Watching TV",Toast.LENGTH_SHORT).show()
        }

        chk6.setOnCheckedChangeListener { button, b ->
            Toast.makeText(applicationContext,"Singing",Toast.LENGTH_SHORT).show()
        }

        rg.setOnCheckedChangeListener { group, checkedId ->

            when(checkedId){
                R.id.rb1->
                    Toast.makeText(applicationContext,"MALE",Toast.LENGTH_SHORT).show()

                R.id.rb2->
                    Toast.makeText(applicationContext,"FEMALE",Toast.LENGTH_SHORT).show()
            }
        }
    }
}