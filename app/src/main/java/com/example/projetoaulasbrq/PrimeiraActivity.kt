package com.example.projetoaulasbrq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PrimeiraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira)

        val cachorro = Cachorro(nome = "Meu cachorro")
        val gato = Gato(nome = "Meu gato")

        levarAoPetshop(cachorro)
        levarAoPetshop(Gato)
    }

    fun pintar(cor: Cor) {

        println()

    }

    fun levarAoPetshop(animal: Animal) {
        println("Levando o(a) ${animal.nome}")
    }
}