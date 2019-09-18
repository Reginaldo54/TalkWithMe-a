package com.nave.talkwithme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        contantoID.setOnClickListener {
            var intent = Intent(this, ContactsActivity::class.java)
            startActivity(intent)
            finish()
        }


        AlimentosID.setOnClickListener {
            var intent = Intent(this, Alimento::class.java)
            startActivity(intent)
            finish()
        }
        AnimaisID.setOnClickListener {
            var intent = Intent(this, Animais::class.java)
            startActivity(intent)
            finish()
        }

        FerramentasID.setOnClickListener {
            var intent = Intent(this, Ferramentas::class.java)
            startActivity(intent)
            finish()
        }

        EletroID.setOnClickListener {
            var intent = Intent(this, Eletrodomestico::class.java)
            startActivity(intent)
            finish()
        }



        ok.setOnClickListener {
            var intent = Intent(this, ContactsActivity::class.java)
            startActivity(intent)
            finish()
        }


        }
    }


