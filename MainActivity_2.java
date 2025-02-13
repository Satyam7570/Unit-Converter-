package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    Spinner spinner;
    Spinner spinner2;
    EditText editText;
    Button button5;
    TextView textView2;

    // ArrayList<String> spg = new ArrayList<>();
    ArrayList<String> sp = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        editText = findViewById(R.id.editText);
        button5 = findViewById(R.id.button5);
        textView2 = findViewById(R.id.textView2);

        sp.add("kg");
        sp.add("g");
        sp.add("lb");


        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, sp);
        spinner.setAdapter(spinnerAdapter);

        ArrayAdapter<String> spinnerAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, sp);
        spinner2.setAdapter(spinnerAdapter2);


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Double dot;

                Double amount = Double.parseDouble(editText.getText().toString());

                if(spinner.getSelectedItem().toString() == "kg" && spinner2.getSelectedItem().toString()== "g")
                {
                    dot = amount*1000;
                    textView2.setText(""+dot);
                }
                else if(spinner.getSelectedItem().toString() == "kg" && spinner2.getSelectedItem().toString()== "lb")
                {
                    dot = amount*2.2046;
                    textView2.setText(""+dot);
                }
                else if(spinner.getSelectedItem().toString() == "kg" && spinner2.getSelectedItem().toString()== "kg")
                {
                    dot = amount*1;
                    textView2.setText(""+dot);
                }
                else if(spinner.getSelectedItem().toString() == "g" && spinner2.getSelectedItem().toString()== "g")
                {
                    dot = amount*1;
                    textView2.setText(""+dot);
                }
                else if(spinner.getSelectedItem().toString() == "g" && spinner2.getSelectedItem().toString()== "kg")
                {
                    dot = amount/1000;
                    textView2.setText(""+dot);
                }
                else if(spinner.getSelectedItem().toString() == "g" && spinner2.getSelectedItem().toString()== "lb")
                {
                    dot = amount/453.59;
                    textView2.setText(""+dot);
                }
                else if(spinner.getSelectedItem().toString() == "lb" && spinner2.getSelectedItem().toString()== "lb")
                {
                    dot = amount*1;
                    textView2.setText(""+dot);
                }
                else if(spinner.getSelectedItem().toString() == "lb" && spinner2.getSelectedItem().toString()== "g")
                {
                    dot = amount*453.59;
                    textView2.setText(""+dot);
                }
                else if(spinner.getSelectedItem().toString() == "lb" && spinner2.getSelectedItem().toString()== "kg")
                {
                    dot = amount/2.204;
                    textView2.setText(""+dot);
                }
            }
        });
    }
}

