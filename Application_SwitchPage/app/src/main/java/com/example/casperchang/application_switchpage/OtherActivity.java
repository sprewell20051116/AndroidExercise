package com.example.casperchang.application_switchpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("OtherActivity", "onCreate");

        // get instance
        Bundle argument = getIntent().getExtras();

        // get String from Key
        String valueOne = argument.getString("KeyNameOne");

        // get Integer from Key
        int valueTwo = argument.getInt("KeyNameTwo");

        // get Floating value from Key
        float valueThree = argument.getFloat("KeyNameThree");

        Log.d("OtherActivity", valueOne);

        TextView showText = new TextView(this);
        showText.setText("Display some string");
        setContentView(showText);

    }
}
