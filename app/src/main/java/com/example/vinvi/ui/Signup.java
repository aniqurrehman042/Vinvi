package com.example.vinvi.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.vinvi.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv_login)
    void loginClick(View view){
        startAnyActivity(Login.class);
    }

    @OnClick(R.id.ll_back_button)
    void backClick(View view){
        onBackPressed();
    }

    private void startAnyActivity(Class<?> activity){
        startActivity(new Intent(this, activity));
    }

}
