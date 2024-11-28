package com.example.chat_bot_class.Data

import com.google.firebase.firestore.FirebaseFirestore

object Injection {
    private val instance:FirebaseFirestore  by lazy {
        FirebaseFirestore.getInstance()
    }

    fun provide():FirebaseFirestore{
        return instance
    }
}