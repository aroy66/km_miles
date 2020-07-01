package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMilesTokm = (Button) findViewById(R.id.buttonConvMilesTokm);
        buttonConvMilesTokm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = findViewById(R.id.editTextMiles);
                EditText textBoxkm = findViewById(R.id.editTextkm);
                double vMiles = Double.valueOf(textBoxMiles.getText().toString());
                double vkm = vMiles / 0.62137;
                DecimalFormat formatval = new DecimalFormat("##.##");
                textBoxkm.setText(formatval.format(vkm));
            }
        });



        Button buttonConvkmToMiles = (Button) findViewById(R.id.buttonConvkmToMiles);
        buttonConvkmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = findViewById(R.id.editTextMiles);
                EditText textBoxkm = findViewById(R.id.editTextkm);
                double vkm = Double.valueOf(textBoxkm.getText().toString());
                double vMiles = vkm * 0.62137;
                DecimalFormat formatval = new DecimalFormat("##.##");
                textBoxMiles.setText(formatval.format(vMiles));
            }
        });



    }
}