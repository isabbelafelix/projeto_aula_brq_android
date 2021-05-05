package com.example.projetoaulasbrq.livros_oo

open class Livros(
        var nome: String,
        var autor: String,
        var editora: String
) {

    fun dadosLivros() = "$nome $autor $editora"

    fun modeloDeCapa() {
        println("Livro Capadura")
    }
}