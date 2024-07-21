package com.corevm.culinariafacil.data

import com.corevm.culinariafacil.model.ListCallck
import com.corevm.culinariafacil.model.Reciver

class ListFoodRemoteDataSource {

    fun findReceivesData(callback: ListCallck) {

        val list = mutableListOf(
            Reciver("Carro", ""),
            Reciver("Carro", ""),
            Reciver("Carro", ""),
            Reciver("Carro", ""),
            Reciver("Carro", ""),
            Reciver("Carro", ""),
            Reciver("Carro", "")
        )

        callback.omSucess(list)
    }
}