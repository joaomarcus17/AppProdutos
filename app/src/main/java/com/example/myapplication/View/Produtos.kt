package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.ActivityProdutosBinding

class Produtos: AppCompatActivity(){
    private lateinit var binding : ActivityProdutosBinding
    private lateinit var mProdutosViewModel: ProdutosViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProdutosBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        this.mProdutosViewModel = ViewModelProvider(this).get(ProdutosViewModel::class.java)


        val produto1 = mProdutosViewModel.checkarProdutos("1")
        val produto2 = mProdutosViewModel.checkarProdutos("2")
        val produto3 = mProdutosViewModel.checkarProdutos("3")
        val produto4 = mProdutosViewModel.checkarProdutos("4")

        binding.produto1.text = produto1.nome.toString()
        binding.produto2.text = produto2.nome.toString()
        binding.produto3.text = produto3.nome.toString()
        binding.produto4.text = produto4.nome.toString()

    }

}

private fun ViewModelProvider.get(java: Class<ProdutosViewModel>): ProdutosViewModel {
    return ProdutosViewModel()
}
