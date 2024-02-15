package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        val btn=findViewById<Button>(R.id.next)
        btn.setOnClickListener {
            intent= Intent(applicationContext,Page4::class.java)
            startActivity(intent)
        }
        val btn2=findViewById<Button>(R.id.prev)
        btn2.setOnClickListener {
            intent= Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}