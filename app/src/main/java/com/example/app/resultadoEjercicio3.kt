package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class resultadoEjercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ejercicio3)

        var text= findViewById<TextView>(R.id.Cadena)
        val cadena = intent.getStringExtra("texto")

        val texto = intent.getStringExtra("texto")
        text.setText(texto.toString())
    }
}