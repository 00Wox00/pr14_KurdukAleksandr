package com.example.pract14

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EditAlarmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_alarm)

        val timeEditText = findViewById<EditText>(R.id.et_alarm_time)
        val dateEditText = findViewById<EditText>(R.id.et_alarm_date)
        val deleteButton = findViewById<Button>(R.id.deleteButton)
        val addButton = findViewById<Button>(R.id.addButton)

        val listButton = findViewById<TextView>(R.id.listButton)
        val alarmButton = findViewById<TextView>(R.id.alarmButton)
        val calendarButton = findViewById<TextView>(R.id.calendarButton)
        val settingsButton = findViewById<TextView>(R.id.settingsButton)

        addButton.setOnClickListener {
            val time = timeEditText.text.toString()
            val date = dateEditText.text.toString()
            if (time.isNotEmpty() && date.isNotEmpty()) {
                Toast.makeText(this, "Будильник сохранён: $date в $time", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Заполните время и дату", Toast.LENGTH_SHORT).show()
            }
        }

        deleteButton.setOnClickListener {
            Toast.makeText(this, "Будильник удалён", Toast.LENGTH_SHORT).show()
            finish()
        }

        listButton.setOnClickListener {
            startActivity(Intent(this, GeneralActivity::class.java))
            finish()
        }

        alarmButton.setOnClickListener {
            Toast.makeText(this, "Вы уже на экране будильников", Toast.LENGTH_SHORT).show()
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