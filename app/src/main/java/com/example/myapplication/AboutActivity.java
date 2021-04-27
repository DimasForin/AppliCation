package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class AboutActivity extends Activity {
   public Button firstLevel;
   public Button secondLevel;
   public Button thirdLevel;
   public static final String MY_SETTINGS="settings";
    public static final String PASS="pass";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        firstLevel = findViewById(R.id.level1);
        secondLevel = findViewById(R.id.level2);
        thirdLevel = findViewById(R.id.level3);
        secondLevel.setEnabled(getPass());
        thirdLevel.setEnabled(false);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        firstLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this, FirstLevel.class);
                startActivity(intent);
            }
        });
        secondLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent1 = new Intent(AboutActivity.this,SecondLevel.class);
            startActivity(intent1);
            }
        });
    }
    public boolean getPass(){
        SharedPreferences sp=getSharedPreferences(MY_SETTINGS,MODE_PRIVATE);

        return sp.getBoolean(PASS,false);
    }
//        SharedPreferences sp=getSharedPreferences(MY_SETTINGS,MODE_PRIVATE);

}

