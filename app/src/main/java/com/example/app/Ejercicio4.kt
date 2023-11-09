package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Ejercicio4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio4)
    }

    fun españa(view: View) {
        var intent = Intent(this, resultadoEjercicio4::class.java)
        var nombrepais="España"
        intent.putExtra("nombrepais", nombrepais)
        var fotopais= R.drawable.ic_launcher_foreground
        intent.putExtra("fotopais", fotopais)
        var habitantes="14101975 habitantes"
        intent.putExtra("habitantes", habitantes)
        startActivity(intent)
    }

    fun francia(view: View) {
        var intent = Intent(this, resultadoEjercicio4::class.java)

        var nombrepais="Francia"
        intent.putExtra("nombrepais", nombrepais)
        var fotopais= R.drawable.ic_launcher_background
        intent.putExtra("fotopais", fotopais)
        var habitantes="1239823 habitantes"
        intent.putExtra("habitantes", habitantes)
        startActivity(intent)

    }
}