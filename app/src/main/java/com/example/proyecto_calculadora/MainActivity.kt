package com.example.proyecto_calculadora
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et_user_name = findViewById(R.id.txt_usuario) as EditText
        var et_password = findViewById(R.id.txt_pass) as EditText
        var btn_submit = findViewById(R.id.btn_login) as Button
        var btn_reset = findViewById(R.id.btn_reset) as Button

        btn_reset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            et_user_name.setText("")
            et_password.setText("")
        }

        btn_submit.setOnClickListener {

            val user_name = et_user_name.text.toString();

            val password = et_password.text.toString();


        if( password == "9831"){
            Toast.makeText(this@MainActivity, ("Bienvenido: "+user_name), Toast.LENGTH_LONG).show()
            val menu = Intent(this, menu::class.java)
            startActivity(menu)
        }
            else{


            Toast.makeText(this@MainActivity, ("NRC INCORRECTO!!!"), Toast.LENGTH_LONG).show()

            }
}

    }}

