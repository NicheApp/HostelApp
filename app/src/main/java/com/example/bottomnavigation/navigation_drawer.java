package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

public class navigation_drawer extends AppCompatActivity {
 private DrawerLayout mdrawer;
 private ActionBarDrawerToggle mtoogle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
    mdrawer=(DrawerLayout)findViewById(R.id.topnavigation);
    mtoogle=new ActionBarDrawerToggle(this,mdrawer,R.string.open,R.string.close);
    mdrawer.addDrawerListener(mtoogle);
    mtoogle.syncState();
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mtoogle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
