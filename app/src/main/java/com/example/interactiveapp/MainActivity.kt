package com.example.interactiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonRead = findViewById<Button>(R.id.btnRead)
        val buttonLight = findViewById<Button>(R.id.btnLight)

        buttonRead.setOnClickListener {
            // change to read mode
            linearLayout.setBackgroundResource(R.color.yellow)
        }

        buttonDark.setOnClickListener {
            // change to dark mode
            linearLayout.setBackgroundResource(R.color.black)
        }

        buttonLight.setOnClickListener {
            linearLayout.setBackgroundResource(R.color.white)
        }
    }
}