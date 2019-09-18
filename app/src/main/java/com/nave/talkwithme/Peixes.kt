package com.nave.talkwithme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.tela_peixe.*

class Peixes: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_peixe)

        voltar13.setOnClickListener {
            var intent = Intent(this, Animais::class.java)
            startActivity(intent)
            finish()
        }


    }
}