package com.example.simpletestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonFaiz = findViewById(R.id.faizButton) as Button
        buttonFaiz.setOnClickListener {
            val intent = Intent(this, FaizBarajaActivity::class.java)
            startActivity(intent)
        }
    }
}