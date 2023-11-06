package com.example.app


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Ejercicio1 : AppCompatActivity() {
    private val tablero = Array(3) { IntArray(3) }
    private lateinit var mensajeGanador: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)
        mensajeGanador = findViewById(R.id.mensajeGanador)
        mensajeGanador.visibility = View.GONE
        inicializarTablero()
    }

    private fun inicializarTablero() {
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                tablero[i][j] = 0
            }
        }
    }

    @SuppressLint("ResourceAsColor")
    fun boton(view: View) {
        val botonPresionado = view as Button

        val fila: Int
        val columna: Int


        when (botonPresionado.id) {
            R.id.boton1 -> {
                fila = 0
                columna = 0
            }
            R.id.boton2 -> {
                fila = 0
                columna = 1
            }
            R.id.boton3 -> {
                fila = 0
                columna = 2
            }
            R.id.boton4 -> {
                fila = 1
                columna = 0
            }
            R.id.boton5 -> {
                fila = 1
                columna = 1
            }
            R.id.boton6 -> {
                fila = 1
                columna = 2
            }
            R.id.boton7 -> {
                fila = 2
                columna = 0
            }
            R.id.boton8 -> {
                fila = 2
                columna = 1
            }
            R.id.boton9 -> {
                fila = 2
                columna = 2
            }
            else -> {
                return
            }
        }


        if (tablero[fila][columna] == 0) {
            botonPresionado.setBackgroundColor(R.color.verde)
            tablero[fila][columna] = 1
            botonPresionado.isEnabled = false

            if (verificarGanador(1)) {
                mostrarMensaje("¡Ganaste!")

            } else if (tableroLleno()) {
                mostrarMensaje("Empate")

            } else {

                turnoMaquina()
            }

        }


    }

    @SuppressLint("ResourceAsColor")
    private fun turnoMaquina() {
        val celdasDisponibles = mutableListOf<Pair<Int, Int>>()

        for (i in 0 until 3) {
            for (j in 0 until 3) {
                if (tablero[i][j] == 0) {
                    celdasDisponibles.add(Pair(i, j))
                }
            }
        }

        if (celdasDisponibles.isNotEmpty()) {
            val celdaAleatoria = celdasDisponibles.random()
            val fila = celdaAleatoria.first
            val columna = celdaAleatoria.second

            val idBoton = resources.getIdentifier("boton${fila * 3 + columna + 1}", "id", packageName)
            val boton = findViewById<Button>(idBoton)

            boton.setBackgroundColor(R.color.black)

            tablero[fila][columna] = 2
            boton.isEnabled = false

            if (verificarGanador(2)) {
                mostrarMensaje("¡Has perdido pito chico!")
            } else if (tableroLleno()) {
                mostrarMensaje("Empate")
            }
        }
    }

    private fun verificarGanador(jugador: Int): Boolean {
        val combinacionesGanadoras = arrayOf(
            intArrayOf(0, 1, 2), intArrayOf(3, 4, 5), intArrayOf(6, 7, 8),
            intArrayOf(0, 3, 6), intArrayOf(1, 4, 7), intArrayOf(2, 5, 8),
            intArrayOf(0, 4, 8), intArrayOf(2, 4, 6)
        )

        for (combinacion in combinacionesGanadoras) {
            val (a, b, c) = combinacion
            if (tablero[a / 3][a % 3] == jugador &&
                tablero[b / 3][b % 3] == jugador &&
                tablero[c / 3][c % 3] == jugador
            ) {
                return true
            }
        }
        return false
    }

    private fun tableroLleno(): Boolean {
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                if (tablero[i][j] == 0) {
                    return false
                }
            }
        }
        return true
    }

    private fun mostrarMensaje(mensaje: String) {
        mensajeGanador.text = mensaje
        mensajeGanador.visibility = View.VISIBLE
    }

    fun repetir(view: View) {
        inicializarTablero()
        recreate()

        }

}
