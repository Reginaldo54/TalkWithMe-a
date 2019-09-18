package com.nave.talkwithme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ferramenta.*

class Ferramentas: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ferramenta)

        button30.setOnClickListener {
            var intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}