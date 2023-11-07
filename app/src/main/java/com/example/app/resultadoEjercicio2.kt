package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class resultadoEjercicio2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ejercicio2)

        val numero = intent.getStringExtra("numero")
        val texto = intent.getStringExtra("texto")

    }

}