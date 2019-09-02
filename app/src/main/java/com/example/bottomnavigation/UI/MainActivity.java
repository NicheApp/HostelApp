package com.example.bottomnavigation.UI;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.example.bottomnavigation.UI.fragments.notifications;
import com.example.bottomnavigation.R;
import com.example.bottomnavigation.UI.fragments.leaverequest;
import com.example.bottomnavigation.UI.fragments.maintenance;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavigationView n=findViewById(R.id.topnavigation);

        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem Item) {

                Fragment selectedFragment=null;
                switch(Item.getItemId())
                {
                    case R.id.first_nav:
                        selectedFragment=new notifications();
                      //  getSupportFragmentManager().beginTransaction().replace(R.id.container,selectedFragment).commit();



                        break;
                    case R.id.second_nav:
                        selectedFragment=new maintenance();
                        break;
                    case R.id.third_nav:
                        selectedFragment=new leaverequest();
                          break;

                }

        getSupportFragmentManager().beginTransaction().replace(R.id.container,selectedFragment).commit();
                return true;
}
        });



    }

    public boolean onCreateOptionsMenu(Menu toprightmenu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawer_menu, toprightmenu);
        return true;
    }
}
