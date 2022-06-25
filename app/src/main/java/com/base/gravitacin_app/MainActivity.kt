package com.base.gravitacin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.AdapterView
import android.widget.LinearLayout
import android.widget.ListAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_element.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Gravitación_app)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list: ArrayList<ListElement> = ArrayList()
        list.add(ListElement("Contenido", "Conceptos, claves", R.drawable.ic_baseline_menu_book_24))
        list.add(
            ListElement(
                "Ejercicios",
                "Prácticas de memoria",
                R.drawable.ic_baseline_psychology_24
            )
        )
        list.add(
            ListElement(
                "Demostración",
                "Situaciones y ejemplos",
                R.drawable.ic_baseline_trip_origin_24
            )
        )
        list.add(
            ListElement(
                "Créditos",
                "Sobre nosotros",
                R.drawable.ic_baseline_supervised_user_circle_24
            )
        )

        val vAdapter = Adapter(this, list)
        listaView.adapter = vAdapter
        /*listaView.setOnClickListener { parent, view, position, id ->
            val intent = Intent(this, Contents::class.java)
            startActivity(intent)
        }*/
    }

}
