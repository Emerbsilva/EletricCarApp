package com.ebsindustrial.eletriccarapp.presentation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ebsindustrial.eletriccarapp.R

class CalcularAutonomiaActivity : AppCompatActivity() {

    // variaveis
    lateinit var preco: EditText
    lateinit var quilometro: EditText
    lateinit var botao: Button
    lateinit var fechar: ImageView
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_autonomia)

        //recuperação dos elementos de tela
        recuperar()

        chamadasDeClick()

    }

    fun chamadasDeClick(){
        //fechar tela no X
        fechar.setOnClickListener {
            finish()
        }

        botao.setOnClickListener {
            calcular()
        }
    }

    fun recuperar(){
        preco = findViewById(R.id.preco)
        quilometro = findViewById(R.id.quilometro)
        botao = findViewById(R.id.bt_calcular)
        fechar = findViewById(R.id.close)
        result = findViewById(R.id.resultado)
    }

    fun calcular(){
        val preco = preco.text.toString().toFloat()
        val quilometro = quilometro.text.toString().toFloat()
        val resultado = preco / quilometro

        result.text = resultado.toString()
    }
}