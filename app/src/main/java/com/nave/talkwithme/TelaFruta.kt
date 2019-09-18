package com.nave.talkwithme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.tela_fruta.*

class TelaFruta: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_fruta)

        voltar1.setOnClickListener {
            var intent = Intent(this, Alimento::class.java)
            startActivity(intent)
            finish()
        }


    }

}
