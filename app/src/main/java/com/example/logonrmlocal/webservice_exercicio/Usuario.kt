package com.example.logonrmlocal.webservice_exercicio

import android.net.UrlQuerySanitizer
import com.google.gson.annotations.SerializedName

data class Usuario(@SerializedName("name") val nome: String,
                   @SerializedName("avatar_url")val avatarUrl: String)