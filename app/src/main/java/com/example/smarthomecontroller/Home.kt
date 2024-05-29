package com.example.smarthomecontroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    private lateinit var currentTempTextView: TextView
    private var currentTemp: Int = 22
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Lights Control Buttons
        val lightsOnButton: Button = findViewById(R.id.lightsOn)
        val lightsOffButton: Button = findViewById(R.id.lightsOff)
//        val livingRoomLightsStatusTextView: TextView =findViewById(R.id.livingRoomLightsStatus)


        updateLightsStatus(false)

        lightsOnButton.setOnClickListener {
            updateLightsStatus(true)
            Toast.makeText(this, "Lights turned on", Toast.LENGTH_SHORT).show()
        }

        lightsOffButton.setOnClickListener {
            updateLightsStatus(false)
            Toast.makeText(this, "Lights turned off", Toast.LENGTH_SHORT).show()
        }

        // Thermostat Control
        currentTempTextView = findViewById(R.id.currentTemp)
        val tempUpButton: Button = findViewById(R.id.tempUp)
        val tempDownButton: Button = findViewById(R.id.tempDown)

        tempUpButton.setOnClickListener {
            currentTemp += 1
            updateCurrentTemp()
        }

        tempDownButton.setOnClickListener {
            currentTemp -= 1
            updateCurrentTemp()
        }
    }

    private fun updateCurrentTemp() {
        currentTempTextView.text = "$currentTemp°C"
        Toast.makeText(this, "Temperature set to $currentTemp°C", Toast.LENGTH_SHORT).show()
    }

    private fun updateLightsStatus(isOn: Boolean) {
        val statusText = if (isOn) "Lights: On" else "Lights: Off"
        val livingRoomLightsStatusTextView: TextView = findViewById(R.id.livingRoomLightsStatus)
        livingRoomLightsStatusTextView.text = statusText
    }

}