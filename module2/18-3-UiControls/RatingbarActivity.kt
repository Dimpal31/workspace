package com.example.uicontrols_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.Toast
import com.example.uicontrols_2.databinding.ActivityRatingbarBinding

class RatingbarActivity : AppCompatActivity(), RatingBar.OnRatingBarChangeListener {
    private lateinit var binding: ActivityRatingbarBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityRatingbarBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rate.setOnRatingBarChangeListener(this)
    }

    override fun onRatingChanged(p0: RatingBar?, p1: Float, p2: Boolean) {
        Toast.makeText(applicationContext,""+ p0!!.rating,Toast.LENGTH_SHORT).show()
    }
}