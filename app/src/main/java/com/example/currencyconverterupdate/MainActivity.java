package com.example.currencyconverterupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View parentView = findViewById(android.R.id.content);

        Converter converter = new Converter(this, parentView);
        converter.process();
    }
}