package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {
    Button button8;
    Spinner spinner7, spinner8;
    TextView textView5;
    EditText editText4;
    ArrayList<String> sp4 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        button8 = findViewById(R.id.button8);
        spinner7 = findViewById(R.id.spinner7);
        spinner8 = findViewById(R.id.spinner8);
        textView5 = findViewById(R.id.textView5);
        editText4 = findViewById(R.id.editText4);

        sp4.add("°C");
        sp4.add("°F");
        sp4.add("K");

        ArrayAdapter<String> spinnerAdapter7 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, sp4);
        spinner7.setAdapter(spinnerAdapter7);

        ArrayAdapter<String> spinnerAdapter8 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, sp4);
        spinner8.setAdapter(spinnerAdapter8);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double bot;
                Double amount = Double.parseDouble(editText4.getText().toString());
                if (spinner7.getSelectedItem().toString() == "°C" && spinner8.getSelectedItem().toString() == "°C")
                {
                    bot = amount*1;
                    textView5.setText(""+bot);
                }
                else if (spinner7.getSelectedItem().toString() == "°C" && spinner8.getSelectedItem().toString() == "K")
                {
                    bot = amount+273.15;
                    textView5.setText(""+bot);
                }
                else if (spinner7.getSelectedItem().toString() == "°C" && spinner8.getSelectedItem().toString() == "°F")
                {
                    bot = amount*1.8 + 32;
                    textView5.setText(""+bot);
                }
                else if (spinner7.getSelectedItem().toString() == "°F" && spinner8.getSelectedItem().toString() == "°F")
                {
                    bot = amount*1;
                    textView5.setText(""+bot);
                }
                else if (spinner7.getSelectedItem().toString() == "°F" && spinner8.getSelectedItem().toString() == "°C")
                {
                    bot = (amount-32)*5/9;
                    textView5.setText(""+bot);
                }
                else if (spinner7.getSelectedItem().toString() == "°F" && spinner8.getSelectedItem().toString() == "K")
                {
                    bot = (amount-32)*5/9 +273.150;
                    textView5.setText(""+bot);
                }
                else if (spinner7.getSelectedItem().toString() == "K" && spinner8.getSelectedItem().toString() == "K")
                {
                    bot = amount*1;
                    textView5.setText(""+bot);
                }
                else if (spinner7.getSelectedItem().toString() == "K" && spinner8.getSelectedItem().toString() == "°C")
                {
                    bot = amount-273.15;
                    textView5.setText(""+bot);
                }
                else if (spinner7.getSelectedItem().toString() == "K" && spinner8.getSelectedItem().toString() == "°F")
                {
                    bot = (amount-273.15)*1.8+32;
                    textView5.setText(""+bot);
                }


            }
        });


    }
}