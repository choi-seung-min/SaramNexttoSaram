package com.example.saramnexttosaram.login

class LoginRepository {
    fun login(id: String?, password: String?): Int{
        return if(id == "sample" && password == "sample"){
            200
        } else{
            404
        }
    }
}