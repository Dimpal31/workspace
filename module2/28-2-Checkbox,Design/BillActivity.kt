package com.example.cafe_ex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BillActivity : AppCompatActivity()
{
    lateinit var tx1:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bill)

        tx1=findViewById(R.id.tx1)

        var i = intent
        var data=i.getStringExtra("BILL")
        tx1.setText(data)
    }
}