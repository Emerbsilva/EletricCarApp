package com.ebsindustrial.eletriccarapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.ebsindustrial.eletriccarapp.R
import com.ebsindustrial.eletriccarapp.adapter.CarAdapter
import com.ebsindustrial.eletriccarapp.data.CarFactory

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
        val adapter = CarAdapter(CarFactory.list)
        //listaCarros.layoutManager = LinearLayoutManager(this)
        listaCarros.adapter = adapter
    }
}