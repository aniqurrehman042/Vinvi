package com.example.vinvi.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vinvi.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class UpdateProfile extends AppCompatActivity {

    @BindView(R.id.tv_page_title)
    TextView tvPageTitle;
    @BindView(R.id.iv_left_button)
    ImageView ivLeftButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);

        ButterKnife.bind(this);

        setPageTitle();

        setLeftButtonImage();
    }

    private void setLeftButtonImage() {
        ivLeftButton.setImageResource(R.drawable.ic_back_arrow);
    }

    private void setPageTitle() {
        tvPageTitle.setText("Update Profile");
    }

    @OnClick(R.id.iv_home_button)
    void homeClick(View view){
        startAnyActivity(Home.class);
    }

    @OnClick(R.id.iv_left_button)
    void settingsClick(View view){
        startAnyActivity(Settings.class);
    }

    private void startAnyActivity(Class<?> activity){
        startActivity(new Intent(this, activity));
    }
}
