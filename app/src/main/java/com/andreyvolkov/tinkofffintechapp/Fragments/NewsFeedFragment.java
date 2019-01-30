package com.andreyvolkov.tinkofffintechapp.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andreyvolkov.tinkofffintechapp.R;
import com.andreyvolkov.tinkofffintechapp.Recyclers.RecyclerViewInternshipsAdapter;

public class NewsFeedFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news_feed, container, false);
        init(view);
        return view;
    }

    private void init(View view){

    }

}
