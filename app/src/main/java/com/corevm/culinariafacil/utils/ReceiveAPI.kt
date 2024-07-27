package com.corevm.culinariafacil.utils

import com.corevm.culinariafacil.model.ExtendedIngredient
import com.corevm.culinariafacil.model.Recipe
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ReceiveAPI {

    @GET("informationBulk")
    fun getListReceive(
        @Query("ids") ids: String, @Query("apiKey") apiKey: String = Retrofit.API_KEY
    ): Call<List<ExtendedIngredient>>

    @GET("informationBulk")
    fun getListReceives(
        @Query("ids") ids: String, @Query("apiKey") apiKey: String = Retrofit.API_KEY
    ): Call<List<Recipe>>

}


