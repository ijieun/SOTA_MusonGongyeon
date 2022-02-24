package com.example.musongongyeon

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView

class NotificationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)

        val btn : AppCompatButton = findViewById(R.id.url_button)

        btn.setOnClickListener(({
            val urlIntent = Intent(Intent.ACTION_VIEW, Uri.parse(("https://tickets.interpark.com/goods/21009146?utm_source=google&utm_medium=cpc&utm_campaign=ticket_musical_20210617_pc_cpc_paidsearch&utm_content=consider_34&utm_term=%EB%A0%88%EB%B2%A0%EC%B9%B4&_emk_keyword=%EB%A0%88%EB%B2%A0%EC%B9%B4&gclid=Cj0KCQiA09eQBhCxARIsAAYRiymWVCH7xzYoDwIo0l1J0vZTsHdWH3hJ15nQVCKygW-jSBvMb26phG8aAk-QEALw_wcB")))
            startActivity(urlIntent)
        }))

        val back : ImageView = findViewById(R.id.noti_back)
        back.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.setting_notifications_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val nextIntent = Intent(this, NotificationSettingActivity::class.java)
        startActivity(nextIntent)
        return super.onOptionsItemSelected(item)
    }
}