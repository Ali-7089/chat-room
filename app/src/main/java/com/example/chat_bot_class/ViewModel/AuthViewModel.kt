package com.example.chat_bot_class.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.chat_bot_class.Data.Injection
import com.example.chat_bot_class.Data.UserRespository
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.launch

class AuthViewModel(
    var userRespository: UserRespository
):ViewModel(){
    private val _authResult =MutableLiveData<Result<Boolean>>()
    val authResult = _authResult
    init {
        userRespository = UserRespository(
            FirebaseAuth.getInstance(),
            FirebaseFirestore.getInstance()
        )
    }

    fun signUp(
        email:String,
        password:String,
        firstName:String,
        lastName:String
    ){
        viewModelScope.launch {
         userRespository.signUp(
               email, password, firstName, lastName
           )
        }
    }

    fun signIn(
        email: String,
        password: String
    ){
        viewModelScope.launch {
            userRespository.signIn(email, password)
        }
    }
}