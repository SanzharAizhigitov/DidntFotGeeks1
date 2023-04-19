package com.geektech.momsquiz
import android.content.Context
import android.content.SharedPreferences

class MyPreferences(context: Context) {

    private val PREFS_NAME = "MyPrefs"
    private val KEY_BOOLEAN = "CREATOR_KEY"

    private val preferences: SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun iAmCreator() {
        preferences.edit().putBoolean(KEY_BOOLEAN, true).apply()
    }
    fun iAmNotCreator() {
        preferences.edit().putBoolean(KEY_BOOLEAN, false).apply()
    }

    fun isYouCreator(): Boolean {
        return preferences.getBoolean(KEY_BOOLEAN, false)
    }
}