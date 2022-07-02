package com.example.myapplication.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText;
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.ViewModel.LoginViewModel
import com.example.myapplication.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding
    private lateinit var mLoginViewModel: LoginViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.mLoginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        binding.botaoLogar.setOnClickListener{
            val textUser = findViewById<EditText>(R.id.User)
            val textPassword = findViewById<EditText>(R.id.Password)
            val user = textUser.text.toString()
            val password = textPassword.text.toString()
            IrMinhaConta(user, password)
        }
    }



    private fun IrMinhaConta(user:String, password: String){
        if(mLoginViewModel.checkUser (user, password) === true){
            startActivity(Intent(this, Home::class.java))
        }else{
            Toast.makeText(this, "Usuário inválido ou Senha incorreta", Toast.LENGTH_LONG).show();
        }
    }


}