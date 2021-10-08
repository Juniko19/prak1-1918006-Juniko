package com.example.pertemuan1_intent_1918006;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends AppCompatActivity {
    EditText a,t;
    Button hitung;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        a = (EditText)findViewById(R.id.input_alas);
        t = (EditText) findViewById(R.id.input_tinggi);
        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView) findViewById(R.id.hasil);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String isialas = a.getText().toString();
                    String isitinggi = t.getText().toString();
                    double a = Double.parseDouble(isialas);
                    double t = Double.parseDouble(isitinggi);
                    double hs = LuasSegitiga(a, t);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());

            }
        });
    }
    public double LuasSegitiga(double a, double t){return a*t/2;}
}
