package com.example.onlinestore;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Задержка на 3 секунды перед переходом к основному Activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Переход к основному Activity
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);

                // Закрытие SplashActivity
                finish();
            }
        }, 3000); // 3000 миллисекунд = 3 секунды
    }
}