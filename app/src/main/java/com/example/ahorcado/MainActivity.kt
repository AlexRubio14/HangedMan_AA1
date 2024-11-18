package com.example.ahorcado

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var splashScreenButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        splashScreenButton  = findViewById(R.id.splashScreenButton)
        splashScreenButton.setOnClickListener {onButtonClick()}
    }

    private fun onButtonClick()
    {
        startActivity(Intent(this, ScrollActivity::class.java))
    }

}