package com.ebsindustrial.eletriccarapp.data

import com.ebsindustrial.eletriccarapp.domain.Carro

object CarFactory {
    val list = listOf<Carro>(
        Carro(
            id = 1,
            preco = "300.000,00",
            bateria = "240 Kw/h",
            potencia = "270 cv",
            recarga = "22 mim",
            urlPhoto = "www.google.com"
        ),
        Carro(
            id = 2,
            preco = "280.000,00",
            bateria = "220 Kw/h",
            potencia = "240 cv",
            recarga = "30 mim",
            urlPhoto = "www.google.com"
        )
    )
}