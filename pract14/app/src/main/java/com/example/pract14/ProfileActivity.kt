package com.example.pract14

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Кнопка "Назад"
        val backButton = findViewById<ImageButton>(R.id.btnBack)

        // Кнопки входа и регистрации
        val loginButton = findViewById<Button>(R.id.btn_login)
        val registerButton = findViewById<Button>(R.id.btn_register)

        // Навигация - используем TextView как в XML
        val listButton = findViewById<TextView>(R.id.listButton)
        val alarmButton = findViewById<TextView>(R.id.alarmButton)
        val calendarButton = findViewById<TextView>(R.id.calendarButton)
        val settingsButton = findViewById<TextView>(R.id.settingsButton)

        // Обработчик кнопки "Назад"
        backButton.setOnClickListener {
            finish()
        }

        // Обработчик кнопки "Войти"
        loginButton.setOnClickListener {
            Toast.makeText(this, "Вход в систему", Toast.LENGTH_SHORT).show()
            // Здесь можно добавить логику входа
        }

        // Обработчик кнопки "Регистрация"
        registerButton.setOnClickListener {
            Toast.makeText(this, "Регистрация", Toast.LENGTH_SHORT).show()
            // Здесь можно добавить логику регистрации
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
            startActivity(Intent(this, AddTaskActivity::class.java))
            finish()
        }

        settingsButton.setOnClickListener {
            Toast.makeText(this, "Вы уже в профиле", Toast.LENGTH_SHORT).show()
        }
    }
}