package com.example.onlinestore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_login);

        TextView fromLoginToRegister = findViewById(R.id.from_login_to_register);

        fromLoginToRegister.setOnClickListener(v -> {
            startActivity(new Intent(this, RegisterActivity.class));
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            finish();
        });

    }
}