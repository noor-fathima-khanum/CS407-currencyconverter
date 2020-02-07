package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activitycc extends AppCompatActivity {

    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_activitycc);

        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        int intValue = intent.getIntExtra("intVariableName", 0);
        int conv_int= (int) (intValue*0.77);
        textView2.setText('\u20ac'+conv_int);
    }
}
