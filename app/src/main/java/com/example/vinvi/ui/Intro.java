package com.example.vinvi.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vinvi.R;
import com.example.vinvi.adapters.IntroPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Intro extends AppCompatActivity {

    @BindView(R.id.vp_main_pager)
    ViewPager vpMainPager;
    @BindView(R.id.v_dot1)
    View dot1;
    @BindView(R.id.v_dot2)
    View dot2;
    @BindView(R.id.v_dot3)
    View dot3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        ButterKnife.bind(this);

        IntroPagerAdapter mainPagerAdapter = new IntroPagerAdapter(getSupportFragmentManager());
        vpMainPager.setAdapter(mainPagerAdapter);

        vpMainPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                Drawable redDot = ResourcesCompat.getDrawable(getResources(), R.drawable.bg_round_red, null);
                Drawable greyDot = ResourcesCompat.getDrawable(getResources(), R.drawable.bg_round_grey, null);

                switch (position){
                    case 0:
                        dot1.setBackground(redDot);
                        dot2.setBackground(greyDot);
                        dot3.setBackground(greyDot);
                        break;
                    case 1:
                        dot2.setBackground(redDot);
                        dot1.setBackground(greyDot);
                        dot3.setBackground(greyDot);
                        break;
                    case 2:
                        dot3.setBackground(redDot);
                        dot2.setBackground(greyDot);
                        dot1.setBackground(greyDot);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    public void dotClick(View view) {
        switch (view.getId()){
            case R.id.v_dot1:
                vpMainPager.setCurrentItem(0);
                break;
            case R.id.v_dot2:
                vpMainPager.setCurrentItem(1);
                break;
            case R.id.v_dot3:
                vpMainPager.setCurrentItem(2);
                break;
        }
    }

    @OnClick(R.id.btn_next)
    void nextClick(View view){
        switch (vpMainPager.getCurrentItem()){
            case 0:
                vpMainPager.setCurrentItem(1);
                break;
            case 1:
                vpMainPager.setCurrentItem(2);
                break;
            case 2:

                break;
        }
    }

    @OnClick(R.id.tv_skip_button)
    void skipClick(View view){
        startAnyActivity(Home.class);
    }

    private void startAnyActivity(Class<?> activity){
        startActivity(new Intent(this, activity));
    }
}
