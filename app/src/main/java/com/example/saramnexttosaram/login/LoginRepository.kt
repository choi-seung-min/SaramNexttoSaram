package com.example.saramnexttosaram.login

import com.example.saramnexttosaram.LoginInfo

class LoginRepository {
    fun login(id: String?, password: String?): Int{
        return if(id == "sample" && password == "sample"){
            200
        } else{
            404
            //TODO user retrofit and return response.body(or code)
        }
    }

    fun get(): LoginInfo{
        return LoginInfo(1, "sample", "sample")
    }
}