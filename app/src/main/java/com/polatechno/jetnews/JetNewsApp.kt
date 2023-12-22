package com.polatechno.jetnews

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class JetNewsApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate JetNewsApp application ")


    }

    companion object{
        const val TAG = "JetNewsApp"
    }
}