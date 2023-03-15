package com.example.call_sms

import android.Manifest.permission.CALL_PHONE
import android.Manifest.permission.SEND_SMS
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.content.PermissionChecker.PERMISSION_GRANTED

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(checkSelfPermission(CALL_PHONE)!= PackageManager.PERMISSION_GRANTED)
        {
            requestPermissions(arrayOf(CALL_PHONE),101)

        }
        if (checkSelfPermission(SEND_SMS)!= PackageManager.PERMISSION_GRANTED)
        {
            requestPermissions(arrayOf(SEND_SMS),101)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        menuInflater.inflate(R.menu.option,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
        when(item.itemId)
        {
            R.id.i1->
            {
                var num="9999999999"
                var i=Intent(Intent.ACTION_CALL)
                i.setData(Uri.parse("tel:"+num))
                startActivity(i)
            }
            R.id.i2->
            {
                var num="7226804490"
                var sm:SmsManager=SmsManager.getDefault()
                sm.sendTextMessage(num,null,"Hello from tops",null,null)
                Toast.makeText(applicationContext,"Sms sent",Toast.LENGTH_LONG).show()

            }


        }
        return super.onOptionsItemSelected(item)
    }
}