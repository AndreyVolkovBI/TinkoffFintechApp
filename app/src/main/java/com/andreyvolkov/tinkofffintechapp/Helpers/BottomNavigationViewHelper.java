package com.andreyvolkov.tinkofffintechapp.Helpers;

import android.util.Log;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import static android.content.ContentValues.TAG;

public class BottomNavigationViewHelper {

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx) {
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(true);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);

        bottomNavigationViewEx.setIconSize(25, 25);
        bottomNavigationViewEx.setIconsMarginTop(21);
    }
}
