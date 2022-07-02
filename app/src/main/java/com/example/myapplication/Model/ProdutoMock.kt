package com.example.myapplication.Model

data class Produto(val id: String, val nome: String)



class ProdutoMock {

    private var produtoList = listOf<Produto>(
        Produto("1","Notebook" ),
        Produto("2","Impressora" ),
        Produto("3", "Celular"),
        Produto("4", "Monitor")

    )

    fun getProduto(id: String): Produto {
        val produtos = produtoList.filter{it.id.equals(id) }

        return produtos[0]
    }



}
