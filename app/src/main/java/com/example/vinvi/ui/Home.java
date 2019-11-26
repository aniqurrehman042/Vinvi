package com.example.vinvi.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.vinvi.R;
import com.example.vinvi.adapters.HomePagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Home extends AppCompatActivity {

    @BindView(R.id.vp_main_pager)
    ViewPager vpMainPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);

        HomePagerAdapter mainPagerAdapter = new HomePagerAdapter(getSupportFragmentManager());
        vpMainPager.setAdapter(mainPagerAdapter);
    }

    @OnClick(R.id.iv_home_button)
    void homeClick(View view){
        startAnyActivity(Home.class);
    }

    @OnClick(R.id.iv_settings)
    void settingsClick(View view){
        startAnyActivity(Settings.class);
    }

    private void startAnyActivity(Class<?> activity){
        startActivity(new Intent(this, activity));
    }
}
