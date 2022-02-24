package com.example.musongongyeon

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class NotificationSettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications_setting)

        supportActionBar!!.setDisplayHomeAsUpEnabled(false)

        val btn: ImageButton = findViewById(R.id.back_button)
        btn.setOnClickListener { finish() }
    }
}