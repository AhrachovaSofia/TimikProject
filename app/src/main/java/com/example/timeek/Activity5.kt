package com.example.timeek

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main5)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val constraintLayout: ConstraintLayout = findViewById<ConstraintLayout>(R.id.main5)
        constraintLayout.setOnClickListener {
            val intent = Intent(this, Activity8::class.java)
            startActivity(intent)
        }
    }
}