package com.example.hosel_app;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton floatingbutton;

   //  This is the snippet which select the required fragement from the bottom activity
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {


            switch (item.getItemId()) {
                case R.id.first_nav:
                    Intent intent1 = new Intent(MainActivity.this, notifications.class);
                    startActivity(intent1);
                    break;
                case R.id.second_nav:

                    Intent intent2 = new Intent(MainActivity.this, maintainance.class);
                    startActivity(intent2);
                    break;
                case R.id.third_nav:
                    Intent intent3= new Intent(MainActivity.this, leave_request.class);
                    startActivity(intent3);

                    break;


            }

            return false;
        }
    };
    //Here it ends

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        //for floating button
        floatingbutton=findViewById(R.id.floatingActionButton);
        floatingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Profile.class));
            }
        });
        //floating button ends here

    }

}
