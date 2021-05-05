package com.example.projetoaulasbrq.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetoaulasbrq.*
import com.example.projetoaulasbrq.animal_oo.Animal
import com.example.projetoaulasbrq.animal_oo.Cachorro
import com.example.projetoaulasbrq.animal_oo.Gato
import com.example.projetoaulasbrq.banco_oo.Banco
import com.example.projetoaulasbrq.banco_oo.Cliente
import com.example.projetoaulasbrq.banco_oo.Funcionario
import com.example.projetoaulasbrq.livros_oo.Livros
import com.example.projetoaulasbrq.livros_oo.LivrosFantasia
import com.example.projetoaulasbrq.livros_oo.LivrosFiccao
import com.example.projetoaulasbrq.livros_oo.LivrosInfantis

class PrimeiraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira)

        // EXEMPLOS DE HERANÇAS E CLASSES ANIMAIS

        val cachorro = Cachorro(nome = "Meu cachorro")
        val gato = Gato(nome = "Meu gato")

        levarAoPetshop(cachorro)
        levarAoPetshop(gato)


        // EXEMPLOS DE HERANÇAS E CLASSES BANCO


        val funcionario = Funcionario(nome = "Maria")
        val cliente = Cliente(nome = "João")

        confirmarDados(funcionario)
        confirmarDados(cliente)


        // EXEMPLOS DE HERANÇAS E CLASSES LIVROS

        val livrosInfantis = LivrosInfantis(nome = "O pequeno Principe", autor = "- Autor: Antoine de Saint-Exupéry", editora = "- Editora: Geração Editorial")
        val livrosFiccao = LivrosFiccao(nome = "O mundo de Sofia", autor = "- Autor: Jostein Gaarder", editora = "- Editora: Seguinte")
        val livrosFantasia = LivrosFantasia(nome = "O Hobbit", autor = "- Autor: J. R. R. Tolkien", editora = "- Editora: WMF Martins Fontes")

        dadosLivrosConfirmados(livrosInfantis)
        dadosLivrosConfirmados(livrosFiccao)
        dadosLivrosConfirmados(livrosFantasia)


//        println(livrosInfantis.dadosLivros())
//        livrosInfantis.modeloDeCapa()
//
//        println(livrosFiccao.dadosLivros())
//        livrosFiccao.modeloDeCapa()
//
//        println(livrosFantasia.dadosLivros())
//        livrosFantasia.modeloDeCapa()


    }



    // EXEMPLOS DE HERANÇAS E CLASSES ANIMAIS

    fun levarAoPetshop(animal: Animal) {
        println("Levando o(a) ${animal.nome}")

    }


    // EXEMPLOS DE HERANÇAS E CLASSES BANCO

    fun confirmarDados(banco: Banco) {
        println("Os dados de ${banco.nome} estão confirmados!")
    }
}


    // EXEMPLOS DE HERANÇAS E CLASSES LIVROS

    fun dadosLivrosConfirmados(livros: Livros) {
        println("Os dados do livro  ${livros.nome} estão confirmados")
    }







// SUBCLASSE: LIVROS = NOME, AUTOR, EDITORA, (CAPA)

// CLASSE: LIVROSINFANTIL
// CLASSE: LIVROSFICÇÃO
// CLASSE: LIVROSFANTASIA







