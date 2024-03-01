package com.example.and102_lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        val text = findViewById<TextView>(R.id.textView)

        var counter = 0  //Integer type

        text.text = counter.toString()
        //Strings

        button.setOnClickListener {
            counter++
            text.text = counter.toString()

        }
        
    }



}