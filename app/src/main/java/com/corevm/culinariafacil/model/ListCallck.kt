package com.corevm.culinariafacil.model

interface ListCallck {

    fun onSucess(recipe: List<Recipe>)

    fun onError(message: String)

    fun complete()
}