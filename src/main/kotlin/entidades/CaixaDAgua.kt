package org.example.Entidades

import org.example.Enumeradores.Cor
import org.example.Enumeradores.Material
import java.math.BigDecimal

class CaixaDAgua(// construtor da classe esses dois parenteses
    val capacidade : Int,
    val material: Material,
    val cor : Cor,
    val peso : Double,
    val preco : BigDecimal,
    val altura : Double,
    val profundidade : Double,
    val largura : Double
)