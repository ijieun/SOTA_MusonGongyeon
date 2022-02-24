package com.example.musongongyeon

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.musongongyeon.databinding.ActivityHomeBinding

class HomeActivity :AppCompatActivity(){

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bell.setOnClickListener{
            startActivity(Intent(this, NotificationsActivity::class.java))
            finish()
        }

        binding.people.setOnClickListener{
            startActivity(Intent(this, ReviewActivity::class.java))
            finish()
        }
    }
}