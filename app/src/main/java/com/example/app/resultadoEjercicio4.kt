package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable

class resultadoEjercicio4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ejercicio4)


        var text = findViewById<TextView>(R.id.textPais)
        var image = findViewById<ImageView>(R.id.imagePais)
        var habitantes = findViewById<TextView>(R.id.textHabitantes)

        val texto = intent.getStringExtra("nombrepais")
        text.text=texto

        if (texto.equals("españa",true)) {
            image.setImageResource(R.drawable.franco)
        }else{
            image.setImageResource(R.drawable.francia)
        }

        val habt = intent.getStringExtra("habitantes")
        habitantes.text=habt

    }
}

