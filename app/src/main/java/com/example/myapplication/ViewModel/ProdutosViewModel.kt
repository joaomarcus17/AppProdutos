package com.example.myapplication

import com.example.myapplication.Model.Produto
import com.example.myapplication.Model.ProdutoMock

class ProdutosViewModel {
    public fun checkarProdutos(id:String): Produto{
        val produto = ProdutoMock().getProduto(id)
        return produto
    }
}