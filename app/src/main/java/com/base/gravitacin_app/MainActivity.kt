package com.base.gravitacin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Gravitación_app)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}