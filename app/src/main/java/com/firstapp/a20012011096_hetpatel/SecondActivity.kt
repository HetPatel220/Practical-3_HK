package com.firstapp.a20012011096_hetpatel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var tv1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        tv1=findViewById(R.id.textview1)
        val intent1=intent
        val displayText=intent1.getStringExtra("MainActivity").toString()
        tv1.text=displayText
    }
}
