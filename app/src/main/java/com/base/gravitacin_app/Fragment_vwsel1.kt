package com.base.gravitacin_app

import android.app.AlertDialog
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_exercise.*
import kotlinx.android.synthetic.main.fragment_vwsel_1.*
import kotlin.properties.Delegates

class Fragment_vwsel1() : Fragment(R.layout.fragment_vwsel_1) {

    var btnEval : Button? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_vwsel_1, container, false)

        val rb1 =view.findViewById<View>(R.id.RB1) as RadioButton
        val rb2 =view.findViewById<View>(R.id.RB2) as RadioButton
        val rb3 =view.findViewById<View>(R.id.RB3) as RadioButton

        btnEval = view.findViewById(R.id.btn_eva1)
        btnEval?.setOnClickListener {
            if (rb1.isChecked) {
                status_result.text = "INCORRECTO"
                text_comment.text = "Los voltios no tiene relación con la ley de la gravedad"
                if (layout_status.visibility == View.INVISIBLE) {
                    layout_status.visibility = View.VISIBLE
                }
                layout_status.setBackgroundResource(R.color.incorrectColor)
                rb2.isEnabled = false
                rb3.isEnabled = false
                val soundIncorrect = MediaPlayer.create(context, R.raw.error)
                soundIncorrect.start()
            }

            if (rb2.isChecked) {
                status_result.text = "CORRECTO"
                text_comment.text = "Así es, la masa genera contracción"
                if (layout_status.visibility == View.INVISIBLE) {
                    layout_status.visibility = View.VISIBLE
                }
                rb1.isEnabled = false
                rb3.isEnabled = false

                val soundCcorrect = MediaPlayer.create(context, R.raw.correct)
                soundCcorrect.start()
            }

            if (rb3.isChecked) {
                status_result.text = "INCORRECTO"
                text_comment.text =
                    "La energía en algún momento se puede relacionar, pero no en este caso"
                layout_status.setBackgroundResource(R.color.incorrectColor)
                if (layout_status.visibility == View.INVISIBLE) {
                    layout_status.visibility = View.VISIBLE
                }
                rb1.isEnabled = false
                rb2.isEnabled = false

                val soundIncorrect = MediaPlayer.create(context, R.raw.error)
                soundIncorrect.start()
            }

            btnEval?.isEnabled = false

            }
            return view
    }
}