package com.example.vinvi.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.vinvi.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChangePassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.iv_home_button)
    void homeClick(View view){
        startAnyActivity(Home.class);
    }

    @OnClick(R.id.iv_back_arrow)
    void backClick(View view){
        onBackPressed();
    }

    private void startAnyActivity(Class<?> activity){
        startActivity(new Intent(this, activity));
    }

}
