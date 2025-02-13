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

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    Spinner spinner3, spinner4;
    TextView textView3;
    Button button6;
    EditText editText2;
    ArrayList<String> sp2 = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        spinner3 = findViewById(R.id.spinner3);
        spinner4 = findViewById(R.id.spinner4);
        textView3 = findViewById(R.id.textView3);
        button6 = findViewById(R.id.button6);
        editText2 = findViewById(R.id.editText2);


        sp2.add("km");
        sp2.add("meter");
        sp2.add("cm");
        sp2.add("mm");
        sp2.add("inch");


        ArrayAdapter<String> spinnerAdapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,sp2);
        spinner3.setAdapter(spinnerAdapter3);

        ArrayAdapter<String> spinnerAdapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,sp2);
        spinner4.setAdapter(spinnerAdapter4);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Double lot;

                Double amount = Double.parseDouble(editText2.getText().toString());

                if(spinner3.getSelectedItem().toString() == "km" && spinner4.getSelectedItem().toString()== "km")
                {
                    lot = amount*1;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "km" && spinner4.getSelectedItem().toString()== "meter")
                {
                    lot = amount*1000;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "km" && spinner4.getSelectedItem().toString()== "cm")
                {
                    lot = amount*100000;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "km" && spinner4.getSelectedItem().toString()== "mm")
                {
                    lot = amount*1000000;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "km" && spinner4.getSelectedItem().toString()== "inch")
                {
                    lot = amount*39370.0787;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "meter" && spinner4.getSelectedItem().toString()== "meter")
                {
                    lot = amount*1;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "meter" && spinner4.getSelectedItem().toString()== "cm")
                {
                    lot = amount*100;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "meter" && spinner4.getSelectedItem().toString()== "mm")
                {
                    lot = amount*1000;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "meter" && spinner4.getSelectedItem().toString()== "inch")
                {
                    lot = amount*39.3700787;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "meter" && spinner4.getSelectedItem().toString()== "km")
                {
                    lot = amount/1000;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "cm" && spinner4.getSelectedItem().toString()== "cm")
                {
                    lot = amount*1;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "cm" && spinner4.getSelectedItem().toString()== "mm")
                {
                    lot = amount*10;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "cm" && spinner4.getSelectedItem().toString()== "inch")
                {
                    lot = amount/2.54;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "cm" && spinner4.getSelectedItem().toString()== "meter")
                {
                    lot = amount/100;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "cm" && spinner4.getSelectedItem().toString()== "km")
                {
                    lot = amount/100000;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "inch" && spinner4.getSelectedItem().toString()== "inch")
                {
                    lot = amount*1;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "inch" && spinner4.getSelectedItem().toString()== "cm")
                {
                    lot = amount*2.54;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "inch" && spinner4.getSelectedItem().toString()== "mm")
                {
                    lot = amount*25.4;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "inch" && spinner4.getSelectedItem().toString()== "meter")
                {
                    lot = amount/39.3700787;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "inch" && spinner4.getSelectedItem().toString()== "km")
                {
                    lot = amount/39370.0787;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "mm" && spinner4.getSelectedItem().toString()== "mm")
                {
                    lot = amount*1;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "mm" && spinner4.getSelectedItem().toString()== "km")
                {
                    lot = amount/1000000;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "mm" && spinner4.getSelectedItem().toString()== "meter")
                {
                    lot = amount/1000;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "mm" && spinner4.getSelectedItem().toString()== "cm")
                {
                    lot = amount/10;
                    textView3.setText(""+lot);
                }
                else if(spinner3.getSelectedItem().toString() == "mm" && spinner4.getSelectedItem().toString()== "inch")
                {
                    lot = amount/25.4;
                    textView3.setText(""+lot);
                }
            }
        });
    }
}

