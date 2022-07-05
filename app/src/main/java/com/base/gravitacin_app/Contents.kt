package com.base.gravitacin_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_contents.*
import kotlinx.android.synthetic.main.activity_main.*

class Contents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contents)

        var list: ArrayList<ListElement> = ArrayList()
        list.add(
            ListElement(
                "Concepto",
                "Generalidades, términos",
                R.drawable.concepto
            )
        )
        list.add(
            ListElement(
                "Fuerza de la gravedad",
                "La expresión de la ley de gravitación",
                R.drawable.fuerza
            )
        )
        list.add(
            ListElement(
                "Efectos",
                "Sobre conjuntos de masas",
                R.drawable.efecto
            )
        )
        list.add(
            ListElement(
                "Deducción",
                "De la ley de la gravedad",
                R.drawable.deduccion
            )
        )

        list.add(
            ListElement(
                "Modelo de trayectoria",
                "Partículas puntuales",
                R.drawable.modelo
            )
        )

        list.add(
            ListElement(
                "Fuerza gravitatoria",
                "En dependencia de la distancia",
                R.drawable.distancia
            )
        )

        list.add(
            ListElement(
                "Fuerza gravitatoria",
                "En dependencia de la masa",
                R.drawable.masa
            )
        )

        list.add(
            ListElement(
                "Constante universal G",
                "Obtención del valor",
                R.drawable.g
            )
        )

        list.add(
            ListElement(
                "Constante de Kepler",
                "Significado físico",
                R.drawable.kepler
            )
        )

        val vAdapter = Adapter(this, list)
        listView.adapter = vAdapter

    }
}