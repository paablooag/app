package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class Ejercicio3 : AppCompatActivity() {
    lateinit var textoo:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)



    }
    var textoEnviar=""
    fun botonInsertar(view: View) {
        var textoo = findViewById<EditText>(R.id.editCadena)
        textoEnviar += textoo.text.toString()+"                                  "


    }

    fun botonPasarDatos(view: View) {

        var intent = Intent(this, resultadoEjercicio3::class.java)
        intent.putExtra("texto", textoEnviar)

        startActivity(intent)
    }

}