package com.example.splashscreen;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView=findViewById(R.id.img1);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://www.javatpoint.com/android-tutorial";
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
  /*  @Override
    public void onBackPressed()
    {
        AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity2.this);
        alert.setTitle("Are you sure you want to exit?");
        DialogInterface.OnClickListener{
            @Override
                    public void OnClick(DialogInterface dialogInterface,int i)
        {
            finishActivity();
        }
    }
    }*/
}