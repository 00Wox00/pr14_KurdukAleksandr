package com.example.pract14

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddTaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)

        // Поля ввода
        val titleEditText = findViewById<EditText>(R.id.et_title)
        val timeEditText = findViewById<EditText>(R.id.et_time)
        val dateEditText = findViewById<EditText>(R.id.et_date)
        val descriptionEditText = findViewById<EditText>(R.id.et_description)

        // Кнопка сохранения
        val saveButton = findViewById<Button>(R.id.saveButton)

        // Навигация - используем LinearLayout как в XML
        val listButton = findViewById<LinearLayout>(R.id.listButton)
        val alarmButton = findViewById<LinearLayout>(R.id.alarmButton)
        val calendarButton = findViewById<LinearLayout>(R.id.calendarButton)
        val settingsButton = findViewById<LinearLayout>(R.id.settingsButton)

        // Кнопка "Назад" (RelativeLayout)
        val backButton = findViewById<android.widget.RelativeLayout>(R.id.backButton)

        // Сохранение задачи
        saveButton.setOnClickListener {
            val title = titleEditText.text.toString()
            val time = timeEditText.text.toString()
            val date = dateEditText.text.toString()
            val description = descriptionEditText.text.toString()

            if (title.isNotEmpty()) {
                Toast.makeText(this, "Задача сохранена: $title", Toast.LENGTH_SHORT).show()

                finish() // Возврат на предыдущий экран
            } else {
                Toast.makeText(this, "Введите заголовок задачи", Toast.LENGTH_SHORT).show()
            }
        }

        // Кнопка "Назад"
        backButton.setOnClickListener {
            finish()
        }

        // Навигация
        listButton.setOnClickListener {
            startActivity(Intent(this, GeneralActivity::class.java))
            finish()
        }

        alarmButton.setOnClickListener {
            startActivity(Intent(this, EditAlarmActivity::class.java))
            finish()
        }

        calendarButton.setOnClickListener {
            Toast.makeText(this, "Вы уже в календаре", Toast.LENGTH_SHORT).show()
        }

        settingsButton.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }
    }
}