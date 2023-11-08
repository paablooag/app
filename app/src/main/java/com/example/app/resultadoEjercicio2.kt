package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class resultadoEjercicio2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ejercicio2)

        var num=findViewById<TextView>(R.id.text1)
        var text= findViewById<TextView>(R.id.text2)

        val numero = intent.getStringExtra("numero")
        val texto = intent.getStringExtra("texto")

        num.setText(numero.toString())
        text.setText(texto.toString())


    }

}