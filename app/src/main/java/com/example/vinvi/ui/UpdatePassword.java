package com.example.vinvi.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.vinvi.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class UpdatePassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_password);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.ll_back_button)
    void backClick(View view){
        onBackPressed();
    }

    private void startAnyActivity(Class<?> activity){
        startActivity(new Intent(this, activity));
    }
}
