package com.example.casperchang.myapplicationtest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Activity activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Activity Flow", "onCreate");

        activity = this;
        Button toNextPageBtn = new Button(this);
        setContentView(toNextPageBtn);

        toNextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent goOtherActivity;
                // 第一個參數放入現在的 Activity。
                // 第二個參數是 Activty 類別的 class 物件，指定要進入的 Activty 是哪一個。
                goOtherActivity = new Intent(activity, OtherActivity.class);
                activity.startActivity(goOtherActivity);
            }
        });

    }
}
