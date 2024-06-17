package com.example.musicapplication.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.musicapplication.R
import com.example.musicapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = this::class.java.simpleName
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_MusicApplication)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShuffle.setOnClickListener {
            startActivity(Intent(this, PlayerActivity::class.java))
        }

        binding.btnPlaylist.setOnClickListener{
            startActivity(Intent(this, Playlist_Activity::class.java))
        }

        binding.btnFavorites.setOnClickListener{
            startActivity(Intent(this, FavoritesActivity::class.java))
        }
    }
}