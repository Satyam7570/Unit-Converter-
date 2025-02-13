package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button, button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MASS();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LENGTH();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TIME();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TEMPERATURE();
            }
        });
    }

    public void MASS(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void LENGTH(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void TIME(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void TEMPERATURE(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
}

