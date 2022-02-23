package com.example.musongongyeon

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.musongongyeon.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity:AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    private lateinit var user: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        user = FirebaseAuth.getInstance()

        binding.registerBtn.setOnClickListener{
            register()
        }
    }

    private fun register() {
        val id = binding.registerEtEmail.text.toString()
        val password = binding.registerEtPw.text.toString()

        if(id.isNotEmpty() && password.isNotEmpty()) {
            user.createUserWithEmailAndPassword(id, password)
                .addOnCompleteListener(MainActivity()) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(
                            this,
                            "가입 완료",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                        startActivity(Intent(this, MainActivity::class.java))
                        finish()
                    }else{
                        //이미 사용된 email일 경우
                        Toast.makeText(
                            this,
                            task.exception!!.message,
                            Toast.LENGTH_SHORT
                        )
                    }
                }

        }else{
            Toast.makeText(
                this,
                "이메일과 비밀번호를 입력해 주세요",
                Toast.LENGTH_SHORT)
                .show()
        }
    }

}