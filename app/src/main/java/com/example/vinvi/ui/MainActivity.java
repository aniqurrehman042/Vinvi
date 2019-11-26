package com.example.vinvi.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.vinvi.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void startAnyActivity(Class<?> activity){
        startActivity(new Intent(this, activity));
    }


    public void buttonClick(View view) {
        switch(view.getId()){
            case R.id.btn_login:
                startAnyActivity(Login.class);
                break;
            case R.id.btn_change_password:
                startAnyActivity(ChangePassword.class);
                break;
            case R.id.btn_create_new_visiting_card:
                startAnyActivity(CreateNewVisitingCard.class);
                break;
            case R.id.btn_forgot_password:
                startAnyActivity(ForgotPassword.class);
                break;
            case R.id.btn_home:
                startAnyActivity(Home.class);
                break;
            case R.id.btn_intro:
                startAnyActivity(Intro.class);
                break;
            case R.id.btn_settings:
                startAnyActivity(Settings.class);
                break;
            case R.id.btn_signup:
                startAnyActivity(Signup.class);
                break;
            case R.id.btn_splash_screen:
                startAnyActivity(SplashScreen.class);
                break;
            case R.id.btn_update_password:
                startAnyActivity(UpdatePassword.class);
                break;
            case R.id.btn_update_profile:
                startAnyActivity(UpdateProfile.class);
                break;
        }
    }
}
