package org.example.crud

import org.example.Enumeradores.Material

fun cadastrarCaixa(){
    /*

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
     */
    println("Escolha o material o qual a caixa é composta: ")
    println("1- Plástico")
    println("2- PVC")
    println("3- Metal")
    println("4- Fita")
    println("5- Cano25")
    println("6- Cano50 ")
    var material : Material
    when(opcao){

        1-> material = Material.PLASTICO
        2-> material = Material.PVC
        3-> material = Material.METAL
        4-> material = Material.FITA
        5-> material = Material.CANO25
        6-> material = Material.CANO50
        else -> material = Material.PLASTICO

        println("Capacidade em litros da caixa...")
        val litros = readln().toDouble()

        println("Altura da caixa")
            val alt = readln().toDouble()

        println("Largura da caixa")
            val larg = readln().toDouble()

        println("Profundidade da caixa")
            val prof = readln().toDouble()

        println("Bla bla bla?")
            val bla = readln().toDouble()
        //Salvar as Variáveis agora dentro da Caixa da classe
        CaixaDAgua(){
            material = material,

        }
    }


}

fun editarCaixa(){

}

fun listarCaixa(){

}

fun excluirCaixa(){

}