package org.example.ui

fun menu(){
    do {
        println(" 1- Cadastrar caixa D' Àgua")
        println(" 2- Editar caixa D' Àgua")
        println(" 3- Listar caixa D' Àgua")
        println(" 4- Excluir caixa D' Àgua")
        println(" 0- Sair")

        var opcao = readln().toInt()

        when(opcao){
            0-> println(" 0- Sair")
            1-> println("Cadastrando Caixa...")
            2-> println("Editando Caixa...")
            3-> println("Listando Caixa...")
            4-> println("Excluindo Caixa...")
            else -> println("Opcão inválida!")
        }
    }while (opcao != 0)

}