package com.example.musongongyeon

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.musongongyeon.databinding.ActivityFindpwBinding

class FindPwActivity:AppCompatActivity() {

    private  lateinit var binding: ActivityFindpwBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFindpwBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.findpwBack.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}