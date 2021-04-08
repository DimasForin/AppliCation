package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class AboutActivity extends Activity {
   public Button firstLevel;
   public Button secondLevel;
   public Button thirdLevel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        firstLevel=findViewById(R.id.level1);
        secondLevel=findViewById(R.id.level2);
        thirdLevel=findViewById(R.id.level3);
        secondLevel.setEnabled(false);
        thirdLevel.setEnabled(false);
        firstLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(AboutActivity.this, FirstLevel.class);
               startActivity(intent);
            }
        });
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

    }
}

