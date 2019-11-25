package com.example.vinvi.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.vinvi.ui.fragments.Intro1Fragment;
import com.example.vinvi.ui.fragments.Intro2Fragment;
import com.example.vinvi.ui.fragments.Intro3Fragment;

public class IntroPagerAdapter extends FragmentPagerAdapter {

    public IntroPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Intro1Fragment();
            case 1:
                return new Intro2Fragment();
            case 2:
                return new Intro3Fragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
