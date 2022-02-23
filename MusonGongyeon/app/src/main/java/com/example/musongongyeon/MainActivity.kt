package com.example.musongongyeon

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.musongongyeon.databinding.ActivityLoginBinding
import com.example.musongongyeon.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    // activity_login
    private lateinit var binding: ActivityLoginBinding
    private lateinit var user: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginSignUp.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java ))
            finish()
        }

        binding.loginBtn.setOnClickListener{
            login()
        }
    }

    private fun login() {
        user = FirebaseAuth.getInstance()
        val id = binding.loginId.text.toString()
        val password = binding.loginPw.text.toString()

        user.signInWithEmailAndPassword(id, password)
            .addOnCompleteListener { mTask ->
                if(mTask.isSuccessful){
                    startActivity(Intent(this,HomeActivity::class.java))
                    finish()
                }else{
                    Toast.makeText(
                        this,
                        mTask.exception!!.message,
                        Toast.LENGTH_SHORT)
                        .show()
                }
            }
    }
}