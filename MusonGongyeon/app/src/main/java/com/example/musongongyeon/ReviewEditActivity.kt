package com.example.musongongyeon

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.musongongyeon.databinding.ActivityRevieweditBinding

class ReviewEditActivity:AppCompatActivity() {
    private lateinit var binding: ActivityRevieweditBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRevieweditBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.reviewBack.setOnClickListener{
            startActivity(Intent(this, ReviewActivity::class.java))
            finish()
        }
    }
}