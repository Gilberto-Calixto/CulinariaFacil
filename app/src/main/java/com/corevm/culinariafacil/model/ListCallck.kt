package com.corevm.culinariafacil.model

interface ListCallck {

    fun onSucess(list: List<Recipe>)

    fun onError(message: String)

    fun complete()
}