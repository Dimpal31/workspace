package com.example.call_sms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class Spinner_ex : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    lateinit var spin:Spinner
    var cityarray= arrayOf("Surat","Rajkot","Ahmedabad")

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner_ex)

        spin=findViewById(R.id.spin)

        var adapter=ArrayAdapter(applicationContext,android.R.layout.simple_spinner_dropdown_item,cityarray)
        spin.adapter=adapter

     spin.setOnItemSelectedListener(this)


    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        Toast.makeText(applicationContext,""+cityarray[p2],Toast.LENGTH_SHORT).show()

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}