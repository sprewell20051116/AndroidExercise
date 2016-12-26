package com.example.casperchang.myapplicationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView showText = new TextView(this);
        showText.setText("OtherActivity");

        setContentView(showText);
        Log.e("OtherActivity", "onCreate");

    }
}
