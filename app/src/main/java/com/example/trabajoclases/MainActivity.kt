package com.example.trabajoclases

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_verdadero : Button = findViewById(R.id.btn_verdadero)
        val btn_falso : Button = findViewById(R.id.btn_falso)

        btn_verdadero.setOnClickListener{
            Toast.makeText(
                this,
                "Bien echo...:)",
                Toast.LENGTH_LONG
            ).show()
        }
        btn_falso.setOnClickListener{
            Toast.makeText(
                this,
                "Chale intenta otra vez...:)",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}