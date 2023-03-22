package com.example.my_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my_fragment.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity()
{
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btn1.setOnClickListener {
            var f=FirstFragment()
            var fm=supportFragmentManager
            var ft=fm.beginTransaction()
            ft.replace(R.id.frmid,f).commit()
        }
    }
}