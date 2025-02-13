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

public class MainActivity4 extends AppCompatActivity {
    Spinner spinner5, spinner6;
    TextView textView4;
    EditText editText3;
    Button button7;
    ArrayList<String> sp3 = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        spinner5 = findViewById(R.id.spinner5);
        spinner6 = findViewById(R.id.spinner6);
        textView4 = findViewById(R.id.textView4);
        editText3 = findViewById(R.id.editText3);
        button7 = findViewById(R.id.button7);

        sp3.add("Hour");
        sp3.add("min");
        sp3.add("sec");

        ArrayAdapter<String> spinnerAdapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, sp3);
        spinner5.setAdapter(spinnerAdapter5);

        ArrayAdapter<String> spinnerAdapter6 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, sp3);
        spinner6.setAdapter(spinnerAdapter6);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double got;

                Double amount = Double.parseDouble(editText3.getText().toString());

                if(spinner5.getSelectedItem().toString() == "Hour" && spinner6.getSelectedItem().toString()== "Hour")
                {
                    got = amount*1;
                    textView4.setText(""+got);
                }
                else if(spinner5.getSelectedItem().toString() == "Hour" && spinner6.getSelectedItem().toString()== "min")
                {
                    got = amount*60;
                    textView4.setText(""+got);
                }
                else if(spinner5.getSelectedItem().toString() == "Hour" && spinner6.getSelectedItem().toString()== "sec")
                {
                    got = amount*3600;
                    textView4.setText(""+got);
                }
                else if(spinner5.getSelectedItem().toString() == "min" && spinner6.getSelectedItem().toString()== "min")
                {
                    got = amount*1;
                    textView4.setText(""+got);
                }
                else if(spinner5.getSelectedItem().toString() == "min" && spinner6.getSelectedItem().toString()== "Hour")
                {
                    got = amount/60;
                    textView4.setText(""+got);
                }
                else if(spinner5.getSelectedItem().toString() == "min" && spinner6.getSelectedItem().toString()== "sec")
                {
                    got = amount*60;
                    textView4.setText(""+got);
                }
                else if(spinner5.getSelectedItem().toString() == "sec" && spinner6.getSelectedItem().toString()== "sec")
                {
                    got = amount*1;
                    textView4.setText(""+got);
                }
                else if(spinner5.getSelectedItem().toString() == "sec" && spinner6.getSelectedItem().toString()== "min")
                {
                    got = amount/60;
                    textView4.setText(""+got);
                }
                else if(spinner5.getSelectedItem().toString() == "sec" && spinner6.getSelectedItem().toString()== "Hour")
                {
                    got = amount/3600;
                    textView4.setText(""+got);
                }

            }
        });

    }
}