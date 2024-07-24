package com.corevm.culinariafacil.model

interface ListCallck {

    fun onSucess(list: List<Reciver>)

    fun onError(message: String)

    fun complete()
}