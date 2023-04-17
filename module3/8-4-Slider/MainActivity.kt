package com.example.sliderlayout_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.daimajia.slider.library.SliderLayout
import com.daimajia.slider.library.SliderTypes.BaseSliderView
import com.daimajia.slider.library.SliderTypes.TextSliderView
import com.example.sliderlayout_kotlin.databinding.ActivityMainBinding
import com.google.android.material.slider.Slider

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var map=HashMap<String,Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        map.put("Image1",R.drawable.l1)
        map.put("Image2",R.drawable.l2)
        map.put("Image3",R.drawable.l4)

        for (name in map.keys)
        {
            var textslider=TextSliderView(this)
            textslider.description(name).image(map.get(name)!!).setScaleType(BaseSliderView.ScaleType.Fit)

        binding.slider.setPresetTransformer(SliderLayout.Transformer.Accordion)
            binding.slider.setDuration(2000)
            binding.slider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom)
            binding.slider.addSlider(textslider)
        }
    }
}