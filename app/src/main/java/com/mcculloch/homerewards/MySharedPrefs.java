package com.mcculloch.homerewards;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPrefs {
    public static void clearAllPrefs() {
        SharedPreferences preferences = MainActivity.instance.getSharedPreferences(MainActivity.getInstance().getString(R.string.shared_prefs_name), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.apply();
    }
    public static void setIsUserLoggedIn(boolean loggedIn) {
        SharedPreferences preferences = MainActivity.instance.getSharedPreferences(MainActivity.getInstance().getString(R.string.shared_prefs_name), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(Constants.spLoggedIn, loggedIn);
        editor.apply();
    }

    public static boolean isUserLoggedIn() {
        SharedPreferences preferences = MainActivity.instance.getSharedPreferences(MainActivity.getInstance().getString(R.string.shared_prefs_name), Context.MODE_PRIVATE);
        return preferences.getBoolean(Constants.spLoggedIn, false);
    }


    public static void setDisplayName(String displayName) {
        SharedPreferences preferences = MainActivity.instance.getSharedPreferences(MainActivity.getInstance().getString(R.string.shared_prefs_name), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(Constants.spDisplayName, displayName);
        editor.apply();
    }

    public static String getDisplayName() {
        SharedPreferences preferences = MainActivity.instance.getSharedPreferences(MainActivity.getInstance().getString(R.string.shared_prefs_name), Context.MODE_PRIVATE);
        return preferences.getString(Constants.spDisplayName, "");
    }

    public static void setUserImageUrl(String userImageUrl) {
        SharedPreferences preferences = MainActivity.instance.getSharedPreferences(MainActivity.getInstance().getString(R.string.shared_prefs_name), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(Constants.spUserImageUrl, userImageUrl);
        editor.apply();
    }

    public static String getUserImageUrl() {
        SharedPreferences preferences = MainActivity.instance.getSharedPreferences(MainActivity.getInstance().getString(R.string.shared_prefs_name), Context.MODE_PRIVATE);
        return preferences.getString(Constants.spUserImageUrl, "");
    }

    public static void setUserEmail(String userEmail) {
        SharedPreferences preferences = MainActivity.instance.getSharedPreferences(MainActivity.getInstance().getString(R.string.shared_prefs_name), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(Constants.spUserEmail, userEmail);
        editor.apply();
    }

    public static String setUserEmail() {
        SharedPreferences preferences = MainActivity.instance.getSharedPreferences(MainActivity.getInstance().getString(R.string.shared_prefs_name), Context.MODE_PRIVATE);
        return preferences.getString(Constants.spUserEmail, "");
    }

}
