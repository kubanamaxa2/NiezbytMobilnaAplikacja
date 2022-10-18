package com.example.niezbytmobilnaaplikacja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = findViewById<EditText>(R.id.editTextTextPersonName).text
        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<TextView>(R.id.imie).text = findViewById<TextView>(R.id.imie).text.toString() + a.toString()
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<TextView>(R.id.imie).text = "Jakub Niemczyk"
        }
    }
}