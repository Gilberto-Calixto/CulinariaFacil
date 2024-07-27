package com.corevm.culinariafacil.data

import com.corevm.culinariafacil.model.ListCallck
import com.corevm.culinariafacil.model.Recipe
import com.corevm.culinariafacil.utils.ReceiveAPI
import com.corevm.culinariafacil.utils.Retrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListFoodRemoteDataSource {

    fun findReceivesData(callback: ListCallck) {

        Retrofit.retrofit()
            .create(ReceiveAPI::class.java)
            .getListReceives("715538,716429") //ids = 715538,716429
            .enqueue(object : Callback<List<Recipe>>{

                override fun onFailure(call: Call<List<Recipe>>, t: Throwable) {
                    val error = t.message
                    callback.onError(error ?: "Erro interno")
                    callback.complete()
                }

                override fun onResponse(
                    call: Call<List<Recipe>>,
                    response: Response<List<Recipe>>
                ) {
                    if (response.isSuccessful) {
                        val lsitReceives = response.body()
                        callback.onSucess(lsitReceives ?: emptyList())
                    } else {
                        val erro = response.errorBody()
                        callback.onError(erro?.string() ?: "Receitão encontrada")
                    }
                    callback.complete()

                }

            })

    }
}