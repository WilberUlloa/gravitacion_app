package com.base.gravitacin_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_contents.*

class Contents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contents)

        val list2 = intent.getSerializableExtra("lista") as ListElement
        title_ScreenTwo.text = list2.title
    }
}