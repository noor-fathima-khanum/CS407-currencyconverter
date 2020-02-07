package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        EditText myTextField = (EditText) findViewById(R.id.editText);
        //Log.i("Info","Button Pressed");
        String str = myTextField.getText().toString();

        //Toast.makeText( MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(str);
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this,com.example.currencyconverter.Main2Activity.class);
        //int intValue = Integer.parseInt(s);
        intent.putExtra("message",s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}