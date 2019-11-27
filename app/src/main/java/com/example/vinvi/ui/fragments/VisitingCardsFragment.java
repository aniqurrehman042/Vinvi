package com.example.vinvi.ui.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.library.banner.BannerLayout;
import com.example.vinvi.R;
import com.example.vinvi.adapters.VisitingCardAdapter;
import com.example.vinvi.models.VisitingCard;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VisitingCardsFragment extends Fragment {

    @BindView(R.id.bl_main_recycler_banner)
    BannerLayout blMainRecyclerBanner;

    ViewPager vpMainPager;
    TabLayout tlMainTabLayout;

    public VisitingCardsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_visiting_cards, container, false);

        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        vpMainPager = getActivity().findViewById(R.id.vp_main_pager);
        tlMainTabLayout = getActivity().findViewById(R.id.tl_main_tab_layout);

        tlMainTabLayout.setupWithViewPager(vpMainPager);

        List<VisitingCard> visitingCards = new ArrayList<>();
        visitingCards.add(new VisitingCard("Aniq", "CEO", "Ichra, Lahore", "abc@gmail.com", "abs@gmail.com", "090078601", "090078601", "03330645378", R.drawable.group));
        visitingCards.add(new VisitingCard("Aniq1", "CEO", "Ichra, Lahore", "abc@gmail.com", "abs@gmail.com", "090078601", "090078601", "03330645378", R.drawable.land));
        visitingCards.add(new VisitingCard("Aniq2", "CEO", "Ichra, Lahore", "abc@gmail.com", "abs@gmail.com", "090078601", "090078601", "03330645378", R.drawable.group));
        visitingCards.add(new VisitingCard("Aniq3", "CEO", "Ichra, Lahore", "abc@gmail.com", "abs@gmail.com", "090078601", "090078601", "03330645378", R.drawable.land));
        visitingCards.add(new VisitingCard("Aniq4", "CEO", "Ichra, Lahore", "abc@gmail.com", "abs@gmail.com", "090078601", "090078601", "03330645378", R.drawable.group));
        visitingCards.add(new VisitingCard("Aniq5", "CEO", "Ichra, Lahore", "abc@gmail.com", "abs@gmail.com", "090078601", "090078601", "03330645378", R.drawable.group));
        visitingCards.add(new VisitingCard("Aniq6", "CEO", "Ichra, Lahore", "abc@gmail.com", "abs@gmail.com", "090078601", "090078601", "03330645378", R.drawable.land));
        visitingCards.add(new VisitingCard("Aniq7", "CEO", "Ichra, Lahore", "abc@gmail.com", "abs@gmail.com", "090078601", "090078601", "03330645378", R.drawable.group));

        VisitingCardAdapter mainRecyclerBannerAdapter = new VisitingCardAdapter(getContext(), visitingCards);
        blMainRecyclerBanner.setAdapter(mainRecyclerBannerAdapter);

    }

}
