package com.example.timeek

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun startActivity4(view: View) {
        val intent = Intent(this, Activity4::class.java)
        startActivity(intent)
    }

    fun startActivity5(view: View) {
        val intent = Intent(this, Activity5::class.java)
        startActivity(intent)
    }

    fun startActivity6(view: View) {
        val intent = Intent(this, Activity6::class.java)
        startActivity(intent)
    }
}