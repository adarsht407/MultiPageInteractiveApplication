package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btn=findViewById<Button>(R.id.next)
        btn.setOnClickListener {
            intent= Intent(applicationContext,Page3::class.java)
            startActivity(intent)
        }
        val btn2=findViewById<Button>(R.id.prev)
        btn2.setOnClickListener {
            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}