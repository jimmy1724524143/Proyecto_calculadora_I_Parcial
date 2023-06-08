package com.example.proyecto_calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton



class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val button: ImageButton = findViewById(R.id.ibtn_calculadora)
        button.setOnClickListener {
            val menu = Intent(this, spinner::class.java)
            startActivity(menu)
        }

        val button2: ImageButton = findViewById(R.id.btn_info)
        button2.setOnClickListener {
            val menu = Intent(this, informacion::class.java)
            startActivity(menu)
        }

        }


    }
