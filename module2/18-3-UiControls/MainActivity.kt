package com.example.uicontrols_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.uicontrols_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btn1.setOnClickListener(this)
        binding.btn2.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {

        if (p0==binding.btn1)
        {
            binding.pb.incrementProgressBy(1)
            setProgress(100*binding.pb.progress)
        }
        if (p0==binding.btn2)
        {
            binding.pb.incrementProgressBy(-1)
            setProgress(100*binding.pb.progress)
        }
    }
}