package com.example.chat_bot_class.Screen

sealed class Screen(val route:String){
    object SignUpSreen:Screen("sign_up_screen")
    object SignInSreen:Screen("sign_in_screen")
    object ChatRoomScreen:Screen("chat_room_screen")
    object ChatScreen:Screen("chat_screen")
}