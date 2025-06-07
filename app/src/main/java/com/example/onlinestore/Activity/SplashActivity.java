package com.example.onlinestore.Activity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.onlinestore.R;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_splash);

        // Задержка на 3 секунды перед переходом к основному Activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Переход к основному Activity
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);

                // Закрытие SplashActivity
                finish();
            }
        }, 3000); // 3000 миллисекунд = 3 секунды
    }
}