package com.example.fragment_task

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class NameFragment : Fragment() {
    lateinit var txt1:TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        // Inflate the layout for this fragment

        var view= inflater.inflate(R.layout.fragment_name, container, false)
        txt1= view.findViewById(R.id.txt1)

        txt1.setOnClickListener {
            var p=ProbileFragment()
            var fm=fragmentManager
            var ft= fm!!.beginTransaction()
            ft.replace(R.id.frmid,p).commit()
        }


        return view
    }


}