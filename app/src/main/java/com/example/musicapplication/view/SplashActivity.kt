package com.example.musicapplication.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.example.musicapplication.R

class SplashActivity : AppCompatActivity() {
    private val TAG = "SplashActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, TAG+ " onCreate")

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            this.finish()
        },1000)
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