package com.ebsindustrial.eletriccarapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var imgCar: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgCar = findViewById(R.id.img_car)

        imgCar.setOnClickListener { detalhes() }

    }

    fun detalhes(){
        startActivity(Intent(this, CalcularAutonomiaActivity::class.java))
    }
}