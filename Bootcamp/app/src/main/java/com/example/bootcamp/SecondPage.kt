package com.example.bootcamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondPage : AppCompatActivity() {
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)
        textView = findViewById(R.id.textView)

        val getData=intent.getStringExtra("send")
        textView.setText(getData)
    }
}