package com.example.vinvi.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.vinvi.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_get_started)
    void getStartedClick(View view){
        startAnyActivity(Home.class);
    }

    private void startAnyActivity(Class<?> activity){
        startActivity(new Intent(this, activity));
    }
}
