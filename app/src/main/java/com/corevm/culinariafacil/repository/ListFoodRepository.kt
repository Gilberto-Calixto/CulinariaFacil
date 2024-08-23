package com.corevm.culinariafacil.repository

import com.corevm.culinariafacil.data.model.Recipe
import com.corevm.culinariafacil.data.remote.ReceiveAPI
import com.corevm.culinariafacil.data.remote.Retrofit

class ListFoodRepository {

    suspend fun getListFood(): List<Recipe> {
        return Retrofit.retrofit()
            .create(ReceiveAPI::class.java)
            .getListReceives(Retrofit.IDS)
    }
}