package com.example.musicapplication.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.musicapplication.databinding.ActivityFavoritesBinding

class FavoritesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFavoritesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoritesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}