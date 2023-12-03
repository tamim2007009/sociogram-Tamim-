package com.tamim.sociogram.Model;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

import com.tamim.sociogram.LoginActivity;
import com.tamim.sociogram.R;

public class FrontPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);


        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            startActivity(new Intent(FrontPage.this, LoginActivity.class));
        },3000); // 5s

    }

}
