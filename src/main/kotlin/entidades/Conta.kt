package org.example.Entidades

import java.math.BigDecimal

open class Conta(
    val pessoa : Pessoa,//opcional
    var saldo : BigDecimal,
    val id : Long, //numeroDaConta
    val cartoes : Int,
) {

}