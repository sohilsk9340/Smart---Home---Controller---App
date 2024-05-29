package com.example.smarthomecontroller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val btn = findViewById<Button>(R.id.signup)
        val btn1 = findViewById<Button>(R.id.button3)

        btn1.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}