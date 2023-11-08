package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class Ejercicio2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)
    }

    fun boton(view: View) {
        val intent = Intent(this, resultadoEjercicio2::class.java)
        val editNumber = findViewById<EditText>(R.id.editTextNumber)
        val editText = findViewById<EditText>(R.id.editText)

        intent.putExtra("texto", editText.text.toString())
        intent.putExtra("numero", editNumber.text.toString())


        startActivity(intent)
    }
}