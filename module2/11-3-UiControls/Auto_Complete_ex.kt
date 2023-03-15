package com.example.call_sms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class Auto_Complete_ex : AppCompatActivity()
{
    var array= arrayOf("Rajkot","Baroda","Surat")
    lateinit var auto:AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete_ex)

        auto=findViewById(R.id.a1)
        auto.threshold=2

        var adapter=ArrayAdapter(applicationContext,android.R.layout.simple_spinner_dropdown_item,array)

        auto.setAdapter(adapter)
    }
}