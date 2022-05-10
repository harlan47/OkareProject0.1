package com.example.okareproject01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivitySetting extends AppCompatActivity {

    private ImageButton home,camera,notifier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        home = (ImageButton) findViewById(R.id.button_home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(ActivitySetting.this, MainActivity.class);
                startActivity(intent);
            }
        });

        camera = (ImageButton) findViewById(R.id.button_video);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(ActivitySetting.this, ActivityCamera.class);
                startActivity(intent);
            }
        });

        notifier = (ImageButton) findViewById(R.id.button_alert);
        notifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(ActivitySetting.this, ActivityNotifier.class);
                startActivity(intent);
            }
        });
    }
}