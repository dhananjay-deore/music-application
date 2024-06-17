package com.example.musicapplication.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.musicapplication.databinding.ActivityPlaylistBinding

class Playlist_Activity : AppCompatActivity() {
    private lateinit var binding: ActivityPlaylistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlaylistBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}