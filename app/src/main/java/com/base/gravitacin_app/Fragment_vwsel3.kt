package com.base.gravitacin_app

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_vwsel_1.*
import kotlinx.android.synthetic.main.fragment_vwsel_1.layout_status
import kotlinx.android.synthetic.main.fragment_vwsel_1.status_result
import kotlinx.android.synthetic.main.fragment_vwsel_2.*
import kotlinx.android.synthetic.main.fragment_vwsel_3.*

class Fragment_vwsel3 : Fragment(R.layout.fragment_vwsel_3) {

    var btnEval : Button? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_vwsel_3, container, false)

        val rb1 =view.findViewById<View>(R.id.RB1) as RadioButton
        val rb2 =view.findViewById<View>(R.id.RB2) as RadioButton
        val rb3 =view.findViewById<View>(R.id.RB3) as RadioButton

        btnEval = view.findViewById(R.id.btn_eva3)
        btnEval?.setOnClickListener {
            if (rb1.isChecked) {
                status_result.text = "CORRECTO"
                text_comment3.text = "Así es, es la expresión correcta"
                if (layout_status.visibility == View.INVISIBLE) {
                    layout_status.visibility = View.VISIBLE
                }
                rb2.isEnabled = false
                rb3.isEnabled = false

                val soundCcorrect = MediaPlayer.create(context, R.raw.correct)
                soundCcorrect.start()
            }

            if (rb2.isChecked) {
                status_result.text = "INCORRECTO"
                text_comment3.text = "No es la constante correcta"
                layout_status.setBackgroundResource(R.color.incorrectColor)
                if (layout_status.visibility == View.INVISIBLE) {
                    layout_status.visibility = View.VISIBLE
                }
                rb1.isEnabled = false
                rb3.isEnabled = false

                val soundIncorrect = MediaPlayer.create(context, R.raw.error)
                soundIncorrect.start()
            }

            if (rb3.isChecked) {
                status_result.text = "INCORRECTO"
                text_comment3.text = "Esta no es la constante correcta"
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