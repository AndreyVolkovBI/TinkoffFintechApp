package com.andreyvolkov.tinkofffintechapp.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andreyvolkov.tinkofffintechapp.R;

public class AccountFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, container, false);
        init(view);

//        betweenSearchButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String userFrom = betweenSearchUserFromLink.getText().toString();
//                String userTo = betweenSearchUserToLink.getText().toString();
//                if (checkStrings(userFrom, userTo)) {
//                    Fragment selectedFragment = new SearchResultFragment(userFrom, userTo, "between");
//                    getFragmentManager().beginTransaction().replace(R.id.between_search_container, selectedFragment).commit();
//                } else {
//                    Toast.makeText(getContext(), "Заполните оба поля", Toast.LENGTH_LONG).show();
//                }
//            }
//        });
        return view;
    }

    private void init(View view){

    }

}
