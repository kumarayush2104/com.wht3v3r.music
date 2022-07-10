package com.wht3v3r.music

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ListView
import android.widget.SeekBar
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var songList: ListView
    private lateinit var songTitle: TextView
    private lateinit var songArtist: TextView
    private lateinit var songLength: TextView
    private lateinit var songProgressBar: SeekBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        songTitle = findViewById(R.id.songTitle)
        songList = findViewById(R.id.songList)
        songArtist = findViewById(R.id.songArtist)
        songLength = findViewById(R.id.songProgress)
        songProgressBar = findViewById(R.id.songProgressBar)

        songTitle.isSelected = true
    }
}