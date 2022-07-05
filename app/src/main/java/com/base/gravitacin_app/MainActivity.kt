package com.base.gravitacin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_contents.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_element.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Gravitación_app)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGoContent.setOnClickListener {
            startActivity(Intent(this, Contents::class.java))
        }

        btnGoExercises.setOnClickListener {
            startActivity(Intent(this, Exercise::class.java))
        }
    }
}
