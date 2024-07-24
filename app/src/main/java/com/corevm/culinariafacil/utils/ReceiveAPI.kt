package com.corevm.culinariafacil.utils

import com.corevm.culinariafacil.model.Reciver
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ReceiveAPI {

    @GET("informationBulk")
    fun getListReceives(
        @Query("ids") ids: String, @Query("apiKey") apiKey: String = Retrofit.API_KEY
    ): Call<List<Reciver>>

}