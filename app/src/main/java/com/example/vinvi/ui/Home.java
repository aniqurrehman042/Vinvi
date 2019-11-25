package com.example.vinvi.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.vinvi.R;
import com.example.vinvi.adapters.HomePagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

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
}
