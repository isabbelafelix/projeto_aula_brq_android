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








