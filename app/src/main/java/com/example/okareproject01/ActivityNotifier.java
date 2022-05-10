package com.example.okareproject01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityNotifier extends AppCompatActivity {

    private ImageButton home,camera,setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifier);

        home = (ImageButton) findViewById(R.id.button_home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(ActivityNotifier.this, MainActivity.class);
                startActivity(intent);
            }
        });

        camera = (ImageButton) findViewById(R.id.button_video);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(ActivityNotifier.this, ActivityCamera.class);
                startActivity(intent);
            }
        });

        setting = (ImageButton) findViewById(R.id.button_setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(ActivityNotifier.this, ActivitySetting.class);
                startActivity(intent);
            }
        });
    }
}