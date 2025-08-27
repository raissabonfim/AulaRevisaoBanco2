package org.example.Entidades

import org.example.Enumeradores.Cor
import org.example.Enumeradores.Material
import org.example.Enumeradores.Setor
import java.math.BigDecimal

class Funcionario(

    cpf: Long,
    nome: String,
    idade: Int,
    sexo: String,
    val funcao: String,
    val salario: BigDecimal,
    val experiencia: Int,
    val habilidade: String,
    val setor: Setor,
    cor: Cor,
    material: Material

) : Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo
) {
    //Comportamentos do Profissional/Funcionario

    fun instalarCaixaDAgua(clt: Funcionario) {
        if (clt.setor.equals(Setor.MONTAGEM)) {
            println("Profissional habilidade")
        } else {
            println("Profissional desqualificado")
        }
        fun receberConta(conta: Conta, aPagar: BigDecimal) {
            conta.saldo = conta.saldo.add(aPagar)
        }
    }
}