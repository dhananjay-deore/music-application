package com.example.musicapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.musicapplication.R

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_MusicApplication)

        setContentView(R.layout.activity_main)
        Log.d(TAG, TAG+ " onCreate")

    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, TAG+ " onStart")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, TAG+ " onStop")
    }



    override fun onPause() {
        super.onPause()
        Log.d(TAG, TAG+ " onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, TAG+ " onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, TAG+ " onDestroy")
    }
}