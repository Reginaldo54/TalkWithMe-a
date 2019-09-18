package com.nave.talkwithme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.tela_legume.*


class TelaLegume: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_legume)

        Voltar4.setOnClickListener {
            var intent = Intent(this, Alimento::class.java)
            startActivity(intent)
            finish()
        }

        }
    }


