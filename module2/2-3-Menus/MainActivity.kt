package com.example.menus_kotlin_ex_new

import android.Manifest.permission.CALL_PHONE
import android.Manifest.permission.SEND_SMS
import android.content.Intent
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), PopupMenu.OnMenuItemClickListener {
    lateinit var txt1:TextView
    lateinit var btn1:Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt1=findViewById(R.id.txt1)
        btn1=findViewById(R.id.btn1)

        if (checkSelfPermission(CALL_PHONE)!=PERMISSION_GRANTED)
        {
            requestPermissions(arrayOf(CALL_PHONE),101)

        }
        if (checkSelfPermission(SEND_SMS)!=PERMISSION_GRANTED)
        {
            requestPermissions(arrayOf(SEND_SMS),101)

        }

        registerForContextMenu(txt1)

        btn1.setOnClickListener {

            var popup=PopupMenu(applicationContext,btn1)
            popup.menuInflater.inflate(R.menu.popup,popup.menu)
            popup.setOnMenuItemClickListener(this)
            popup.show()
        }

    }


    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?)
    {
        menuInflater.inflate(R.menu.context,menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean
    {
        when(item.itemId)
        {
            R.id.i1->
                Toast.makeText(applicationContext,"Position call",Toast.LENGTH_SHORT).show()
        }

        return super.onContextItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        menuInflater.inflate(R.menu.options,menu)
        return super.onCreateOptionsMenu(menu)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
        when(item.itemId) {
            R.id.i1 -> {
                try {
                    var num = "1234567890"
                    var i = Intent(Intent.ACTION_CALL)
                    i.setData(Uri.parse("tel:" + num))
                    startActivity(i)
                } catch (e: Exception) {
                    Toast.makeText(
                        applicationContext,
                        "Please Allow permission for call",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            R.id.i2 -> {
                finishAffinity()
            }
        }
            return super.onOptionsItemSelected(item)
    }

    override fun onMenuItemClick(p0: MenuItem?): Boolean {
        when (p0!!.itemId) {
            R.id.i1 -> {
                var num = "7226804490"
                var sms: SmsManager = SmsManager.getDefault()
                sms.sendTextMessage(num, null, "Hello From Tops", null, null)
                Toast.makeText(applicationContext, "Sms Sent", Toast.LENGTH_SHORT).show()

            }
        }
        return false
    }


}
