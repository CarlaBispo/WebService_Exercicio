package com.example.logonrmlocal.webservice_exercicio


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("/users/{username}")
    fun buscarUsuario(@Path("username") username: String): Call<Usuario>
}