package com.base.gravitacin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_contents.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_exercise.*

class Exercise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)

        var btnEval = findViewById<Button>(R.id.btn_eva1)
        var pts: Int = 0

        val Check1 = findViewById<View>(R.id.checkB1) as CheckBox
        /*val Check2 = findViewById<View>(R.id.checkB2) as CheckBox
        val Check3 = findViewById<View>(R.id.checkB3) as CheckBox
        val Check4 = findViewById<View>(R.id.checkB4) as CheckBox*/

        btnEval.setOnClickListener {
            if (Check1.isChecked) {
                status_result.text = "CORRECTO"
                if (layout_status.visibility == View.INVISIBLE){
                    layout_status.visibility = View.VISIBLE
                }
                pts = 10
                status_puntaje.text = pts.toString()
            }
        }
    }
}