package com.nave.talkwithme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.tela_carne.*


class TelaCarne : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_carne)

        Voltar2.setOnClickListener {
            var intent = Intent(this, Alimento::class.java)
            startActivity(intent)
            finish()
        }
    }
}


