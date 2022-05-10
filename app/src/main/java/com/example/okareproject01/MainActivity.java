package com.example.okareproject01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton camera,notifier,setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        camera = (ImageButton) findViewById(R.id.button_video);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ActivityCamera.class);
                startActivity(intent);
            }
        });

        notifier = (ImageButton) findViewById(R.id.button_alert);
        notifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ActivityNotifier.class);
                startActivity(intent);
            }
        });

        setting = (ImageButton) findViewById(R.id.button_setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ActivitySetting.class);
                startActivity(intent);
            }
        });
    }
}