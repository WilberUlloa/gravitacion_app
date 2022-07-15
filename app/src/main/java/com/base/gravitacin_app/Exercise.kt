package com.base.gravitacin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.voice.VoiceInteractionSession
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.app.ActivityManagerCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.base.gravitacin_app.databinding.ActivityExerciseBinding
import com.base.gravitacin_app.databinding.ActivityMainBinding
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_contents.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_exercise.*
import kotlinx.android.synthetic.main.fragment_vwsel_1.*
import kotlin.properties.Delegates

class Exercise : AppCompatActivity() {

    lateinit var binding : ActivityExerciseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btShFr1.setOnClickListener{
            replaceFragment(Fragment_vwsel1())
            text_firstView.isVisible = false
            image_firstView.isVisible = false
        }

        binding.btShFr2.setOnClickListener{
            replaceFragment(Fragment_vwsel2())
            text_firstView.isVisible = false
            image_firstView.isVisible = false
        }

        binding.btShFr3.setOnClickListener{
            replaceFragment(Fragment_vwsel3())
            text_firstView.isVisible = false
            image_firstView.isVisible = false
        }

        binding.btShFr4.setOnClickListener{
            replaceFragment(Fragment_vwsel4())
            text_firstView.isVisible = false
            image_firstView.isVisible = false
        }

        binding.btShFr5.setOnClickListener{
            replaceFragment(Fragment_vwsel_5())
            text_firstView.isVisible = false
            image_firstView.isVisible = false
        }

    }

    private fun replaceFragment(vfragment : Fragment){

        var fragmManager = supportFragmentManager
        val fragmTransaction = fragmManager.beginTransaction()
        fragmTransaction.replace(R.id.fragmentContainer, vfragment)
        fragmTransaction.commit()
    }

}

