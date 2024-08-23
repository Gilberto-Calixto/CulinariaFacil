package com.corevm.culinariafacil.data.remote

import com.corevm.culinariafacil.data.model.ExtendedIngredient
import com.corevm.culinariafacil.data.model.Recipe
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ReceiveAPI {

    @GET("informationBulk")
    fun getListReceive(
        @Query("ids") ids: String, @Query("apiKey") apiKey: String = Retrofit.API_KEY
    ): Call<List<ExtendedIngredient>>

    @GET("informationBulk")
    suspend fun getListReceives(
        @Query("ids") ids: String, @Query("apiKey") apiKey: String = Retrofit.API_KEY
    ): List<Recipe>


}


