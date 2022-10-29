package com.example.simpletestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonIbtisam = findViewById(R.id.ibtisamButton) as Button
        buttonIbtisam.setOnClickListener {
            val intent = Intent(this, IbtisamBarajaActivity::class.java)
            startActivity(intent)
        }
    }
}