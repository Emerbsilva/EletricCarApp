package com.ebsindustrial.eletriccarapp.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.ebsindustrial.eletriccarapp.R
import com.ebsindustrial.eletriccarapp.adapter.CarAdapter

class MainActivity : AppCompatActivity() {

    lateinit var listaCarros: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recuperar()

        setupList()

    }

//    fun detalhes(){
//        startActivity(Intent(this, CalcularAutonomiaActivity::class.java))
//    }

    fun recuperar(){
        listaCarros = findViewById(R.id.rv_lista_carros)
    }

    fun setupList() {
        var dados = arrayOf(
            "Emerson",
            "Doroteia",
            "Isabelly",
            "Lunna"
        )

        val adapter = CarAdapter(dados)
        listaCarros.adapter = adapter
    }
}