package com.example.vinvi.adapters;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.vinvi.ui.fragments.GreetingCardsFragment;
import com.example.vinvi.ui.fragments.VisitingCardsFragment;

public class HomePagerAdapter extends FragmentPagerAdapter {

    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new VisitingCardsFragment();
            case 1:
                return new GreetingCardsFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch(position){
            case 0:
                return "Visiting Cards";
            case 1:
                return "Greeting Cards";
        }

        return super.getPageTitle(position);
    }
}
