package com.cbellmont.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mi_scroll_con_barra_abajo_constraint)
        /* DESCOMENTAR PARA PROBAR mi_scroll_view
        val textView = findViewById<TextView>(R.id.textoHolas)
        var texto = "Empezamossss....\n"
        for (i in 0..100) {
            texto += "Hola $i :) \n"
        }
        textView.text = texto
        */
        Log.d("CARLOS", "Hola Hola, estoy en el onCreate")
    }
}