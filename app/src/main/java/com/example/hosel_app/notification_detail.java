package com.example.hosel_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class notification_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_detail);
        Intent intent = getIntent();
       String  id = intent.getStringExtra("txt");
        //String url= intent.getStringExtra("string_url");
        Toast.makeText(getApplicationContext(),id,Toast.LENGTH_LONG).show();

    }
}
