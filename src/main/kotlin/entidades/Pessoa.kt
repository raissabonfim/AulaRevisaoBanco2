package org.example.Entidades

import java.math.BigDecimal

open class Pessoa (
    val nome: String,
    val cpf: Long,
    val sexo : String,
    val idade : Int
) {
    //Comportamento
    open fun receberConta(conta: Conta, aReceber: BigDecimal) {
        conta.saldo = conta.saldo.add(aReceber)
    }
}