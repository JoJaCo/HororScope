package com.joja.andriod.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


private lateinit var resultButton: Button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultButton = findViewById(R.id.getReport)
        resultButton.setOnClickListener { view ->
            println("It is working")
        }




    }
}