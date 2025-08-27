package org.example.Entidades

import java.math.BigDecimal

class Cliente(
    nome: String,
    val sobrenome: String,
    idade: Int,
    cpf: Long,
    sexo: String,
    val endereco: String,
    val telefone: String,
    val matricula: Int,

    ) : Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo
){
    //Comportamento
    override fun receberConta(conta : Conta, aReceber : BigDecimal){
        conta.saldo = conta.saldo.add(aReceber)
    }
}