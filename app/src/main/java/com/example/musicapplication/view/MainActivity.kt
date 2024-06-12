package com.example.musicapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.musicapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_MusicApplication)

        setContentView(R.layout.activity_main)
    }
}