package com.example.vinvi.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.vinvi.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv_forgot_password)
    void forgotClick(View view){
        startAnyActivity(ForgotPassword.class);
    }

    @OnClick(R.id.tv_signup)
    void signupClick(View view){
        startAnyActivity(Signup.class);
    }

    @OnClick(R.id.ll_back_button)
    void backClick(View view){
        onBackPressed();
    }

    private void startAnyActivity(Class<?> activity){
        startActivity(new Intent(this, activity));
    }
}
