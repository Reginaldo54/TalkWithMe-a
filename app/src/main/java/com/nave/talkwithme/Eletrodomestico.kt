package com.nave.talkwithme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_eletrodomestico.*

class Eletrodomestico : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eletrodomestico)

        button2.setOnClickListener {
            var intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}