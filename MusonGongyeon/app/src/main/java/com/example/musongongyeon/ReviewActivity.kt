package com.example.musongongyeon

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.musongongyeon.databinding.ActivityReviewBinding

class ReviewActivity :AppCompatActivity() {
    private lateinit var binding: ActivityReviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.home.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        binding.bell.setOnClickListener{
            startActivity(Intent(this, NotificationsActivity::class.java))
            finish()
        }
    }
}