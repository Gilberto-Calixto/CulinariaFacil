package com.corevm.culinariafacil.utils

import com.corevm.culinariafacil.data.model.Recipe

interface ListCallck {

    fun onSucess(recipe: List<Recipe>)

    fun onError(message: String)

    fun complete()
}