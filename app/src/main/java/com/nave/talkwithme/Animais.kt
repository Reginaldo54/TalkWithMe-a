package com.nave.talkwithme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nave.talkwithme.MenuActivity
import com.nave.talkwithme.R
import kotlinx.android.synthetic.main.activity_animais.*

class Animais : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animais)

        aves.setOnClickListener {
            var intent = Intent(this, Aves::class.java)
            startActivity(intent)
            finish()
        }

        mamiferos.setOnClickListener {
            var intent = Intent(this, Mamiferos::class.java)
            startActivity(intent)
            finish()
        }

        peixes.setOnClickListener {
            var intent = Intent(this, Peixes::class.java)
            startActivity(intent)
            finish()
        }
        voltar15.setOnClickListener {
            var intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}