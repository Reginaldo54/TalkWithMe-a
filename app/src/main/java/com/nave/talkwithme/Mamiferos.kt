package com.nave.talkwithme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.tela_mamifero.*

class Mamiferos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_mamifero)

        Voltar31.setOnClickListener {
            var intent = Intent(this, Animais::class.java)
            startActivity(intent)
            finish()
        }


    }
}