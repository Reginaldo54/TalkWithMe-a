package com.nave.talkwithme

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.activity_contacts.*

class ContactsActivity : AppCompatActivity() {

    private lateinit var viewAdapter : RecyclerView.Adapter<*>
    private lateinit var viewManager : RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        actionBar?.setDisplayHomeAsUpEnabled(true)

        var listContato = mutableListOf<ContactData>()

        listContato.let{

            listContato.add ( ContactData ( "Reginaldo Alves" ,   "reginaldo.alves.junior54@gmail.com",R.drawable.logo3))
            listContato.add ( ContactData ( "Lucas Mateus" , "lucasmateus1761@gmail.com",R.drawable.logo1))
            listContato.add ( ContactData( "Helton Escobar" , "heltonscobar@gmail.com",R.drawable.logo2))
            listContato.add ( ContactData ( "Victor Oliveira" , "vdeosantos@nave.org.br",R.drawable.logo4))
            listContato.add ( ContactData ( "Oberdan Alves" , "oberdan.nave.recife@gmail.com",R.drawable.logo5))

        }

        viewAdapter = ContactsAdapter(listContato)
        viewManager = LinearLayoutManager(this)
        contacts_design_list.adapter = viewAdapter
        contacts_design_list.layoutManager = viewManager

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

}
