package com.ebsindustrial.eletriccarapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ebsindustrial.eletriccarapp.R
import com.ebsindustrial.eletriccarapp.domain.Carro

class CarAdapter (private val carros: List<Carro>) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {

    // Cria uma nova View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carro_item, parent, false)
        return ViewHolder(view)
    }

    // Pega o conteudo da view e troca pela informação de item de uma lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.preco.text = carros[position].preco
        holder.bateria.text = carros[position].bateria
        holder.potencia.text = carros[position].potencia
        holder.recarga.text = carros[position].recarga
    }

    //Pega a quantidade de carros da lista
    override fun getItemCount(): Int = carros.size

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val preco: TextView
        val bateria: TextView
        val potencia: TextView
        val recarga: TextView
        init{
            view.apply {
                preco = findViewById(R.id.preco_car)
                bateria = findViewById(R.id.autonimia_bateria)
                potencia = findViewById(R.id.potencia_car)
                recarga = findViewById(R.id.recarga_bateria)
            }

        }
    }
}


