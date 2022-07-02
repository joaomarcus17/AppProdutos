package com.example.myapplication.View
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import com.example.myapplication.Produtos
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityHomeBinding


class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    //private val  dao: ProdutoMock = ProdutoMock()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonAdicionar.setOnClickListener{
            IrProdutos()
            configuraNovoProduto()
        }
    }


    private fun configuraNovoProduto(){
        val botaoNovoProduto =
            findViewById<Button>(R.id.buttonAdicionar)
        botaoNovoProduto.setOnClickListener{
            IrProdutos()
        }
    }

    fun IrProdutos() {
   startActivity(Intent(this, Produtos::class.java))
    }

    override fun onResume(){
        super.onResume()
        configuraLista()
    }

    private fun configuraLista(){
        val listaProdutos = findViewById<ListView>(R.id.listaItem)
        ArrayAdapter<Any?>(
            this,
            android.R.layout.simple_list_item_1,
      //      dao.todosProdutos() as List<Any?>
        ).also { listaProdutos.adapter = it }
    }
}
