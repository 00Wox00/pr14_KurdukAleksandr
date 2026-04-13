package com.example.pract14

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GeneralActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general)

        val listButton = findViewById<TextView>(R.id.listButton)
        val alarmButton = findViewById<TextView>(R.id.alarmButton)
        val calendarButton = findViewById<TextView>(R.id.calendarButton)
        val settingsButton = findViewById<TextView>(R.id.settingsButton)

        listButton.setOnClickListener {
            // Уже на этом экране
        }

        alarmButton.setOnClickListener {
            startActivity(Intent(this, EditAlarmActivity::class.java))
            finish()
        }

        calendarButton.setOnClickListener {
            startActivity(Intent(this, AddTaskActivity::class.java))
            finish()
        }

        settingsButton.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }
    }
}