package com.ebsindustrial.eletriccarapp.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.ebsindustrial.eletriccarapp.R
import com.ebsindustrial.eletriccarapp.adapter.CarAdapter
import com.ebsindustrial.eletriccarapp.data.CarFactory
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CarFragment : Fragment() {

    lateinit var listaCarros: RecyclerView
    lateinit var fabCalcular: FloatingActionButton

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.car_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recuperar(view)
        setupList()
        setupListener()
    }

    fun recuperar(view: View){
        view.apply {
            listaCarros = findViewById(R.id.rv_lista_carros)
            fabCalcular = findViewById(R.id.fab_calcular)
        }

    }

    fun setupList() {
        val adapter = CarAdapter(CarFactory.list)
        listaCarros.adapter = adapter
    }

    fun setupListener(){
        fabCalcular.setOnClickListener {
            startActivity(Intent(context, CalcularAutonomiaActivity::class.java))
        }
    }
}


