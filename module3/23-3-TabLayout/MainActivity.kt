package com.example.tablayout_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity()
{
    lateinit var toolbar: Toolbar
    lateinit var viewPager:ViewPager
    lateinit var tabLayout:TabLayout

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar=findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        viewPager=findViewById(R.id.viewpager)
        setupviewpager()

        tabLayout=findViewById(R.id.tab)
        tabLayout.setupWithViewPager(viewPager)

    }

    private fun setupviewpager() {

        var adapter=MyAdapter(supportFragmentManager)
        adapter.mydata("CHAt",ChatFragment())
        adapter.mydata("STATUS",StatusFragment())
        adapter.mydata("CALL",CallFragment())
        viewPager.adapter=adapter
    }
}