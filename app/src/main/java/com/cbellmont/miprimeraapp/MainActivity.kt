package com.cbellmont.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mi_primera_pantalla)
        Log.d("CARLOS", "Hola Hola, estoy en el onCreate")
    }
}