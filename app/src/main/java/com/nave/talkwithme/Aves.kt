package com.nave.talkwithme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nave.talkwithme.R
import kotlinx.android.synthetic.main.tela_aves.*

class Aves: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_aves)

        voltar12.setOnClickListener {
            var intent = Intent(this, Animais::class.java)
            startActivity(intent)
            finish()
        }


    }
}