package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ejercicio1(view: View) {
        val intent = Intent(this, Ejercicio1::class.java)
        startActivity(intent)
    }

    fun ejercicio2(view: View) {
        val intent = Intent(this, Ejercicio2::class.java)
        startActivity(intent)
    }

    fun ejercicio3(view: View) {
        val intent = Intent(this, Ejercicio3::class.java)
        startActivity(intent)
    }

    fun ejercicio4(view: View) {
        val intent = Intent(this, Ejercicio4::class.java)
        startActivity(intent)
    }

}