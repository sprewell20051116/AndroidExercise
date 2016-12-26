package com.example.casperchang.application_switchpage;

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
        Log.d("MainActivity", "onCreate");
        activity = this;

        Button toNextPage = new Button(this);
        setContentView(toNextPage);


        toNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //建立包裹
                Bundle argument = new Bundle();
                //放入字串，key 取名 KeyNameOne
                argument.putString("KeyNameOne","String Text");
                //放入整數，key 取名 KeysNameTwo
                argument.putInt("KeysNameTwo",100);
                //放入浮點數，key 取名 KeyNameTwo
                argument.putFloat("KeyNameTwo",100.0F);

                //建立 Intent 物件，意圖開啟其他 Activity。
                Intent goOtherActivity = new Intent(activity, OtherActivity.class);
                //將包裹放入 Intent 中。
                goOtherActivity.putExtras(argument);
                activity.startActivity(goOtherActivity);
            }
        });

    }
}
