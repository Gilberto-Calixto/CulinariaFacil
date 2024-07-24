package com.corevm.culinariafacil.utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {

    private const val URL_BASE = "https://api.spoonacular.com/recipes/"

    const val API_KEY = "666a04bc13044413911eb0936e3fb264"

    fun retrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}