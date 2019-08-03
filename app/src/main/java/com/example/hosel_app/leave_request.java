package com.example.hosel_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class leave_request extends AppCompatActivity {
    private static final String tag ="MainActivity";
    private TextView fromdate,todate;
    private DatePickerDialog.OnDateSetListener from_date,to_date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_leave_request);
        fromdate=findViewById(R.id.from_date);
        todate=findViewById(R.id.to_date);

        final Spinner spinner3=findViewById(R.id.hostel);
        final Spinner spinner2 =  findViewById(R.id.course);
        final Spinner spinner1 = findViewById(R.id.branch);

        List<String> hostel = new ArrayList<String>();
        List<String> course = new ArrayList<String>();
        List<String> branch = new ArrayList<String>();


        hostel.add("Select Hostel");
        hostel.add("Paari");
        hostel.add("Kaari");
        hostel.add("Sannasi");
        hostel.add("Nelson Mandela");
        hostel.add("PF block");
        hostel.add("Manoranjitan");
        hostel.add("Mullai");
        hostel.add("Malligai");
        hostel.add("Thamarai");


        course.add("Select course");
        course.add("B.Tech");

        branch.add("Select Branch");
        branch.add("Computer Science");
        branch.add("Electronics");
        branch.add("Electrical");
        branch.add("Mechanical");
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                branch);
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                course);

        ArrayAdapter<String> hosteladapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                hostel);
        hosteladapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(myAdapter);
        spinner2.setAdapter(myAdapter2);
        spinner3.setAdapter((hosteladapter));



        fromdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal=Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dialog=new DatePickerDialog(leave_request.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        from_date,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();


            }
        });
        from_date=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month=month+1;
                String date=month+"/"+day+"/"+year;
                fromdate.setText(date);
            }
        };

        todate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal=Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dialog=new DatePickerDialog(leave_request.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        to_date,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();


            }
        });
        to_date=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month=month+1;
                String date=month+"/"+day+"/"+year;
                todate.setText(date);
            }
        };


    }
}
