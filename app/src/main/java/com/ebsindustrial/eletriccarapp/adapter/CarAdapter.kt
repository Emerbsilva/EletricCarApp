package com.ebsindustrial.eletriccarapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ebsindustrial.eletriccarapp.R

class CarAdapter (private val carros: Array<String>) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {

    // Cria uma nova View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carro_item, parent, false)
        return ViewHolder(view)
    }

    // Pega o conteudo da view e troca pela informação de item de uma lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = carros[position]
    }

    //Pega a quantidade de carros da lista
    override fun getItemCount(): Int = carros.size

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView
        init{
            textView = view.findViewById(R.id.txt_preco_car)
        }
    }
}


