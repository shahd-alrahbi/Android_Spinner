package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Spinner spinner;
String [] names={"Shahd","Waad","Saad"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<>(this,R.layout.drop_down_menu_item,names);
        spinner.setAdapter(arrayAdapter);
    }
}