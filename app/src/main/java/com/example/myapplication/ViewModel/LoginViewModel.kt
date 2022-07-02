package com.example.myapplication.ViewModel
import UserMock
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel (){

    public fun checkUser (user: String, password: String): Boolean{
        val user = UserMock().getUserByEmail(user)
        if (!user.isEmpty()) {
            if (user[0].password == password) {
                return true
            }
        }
        return false
    }
}