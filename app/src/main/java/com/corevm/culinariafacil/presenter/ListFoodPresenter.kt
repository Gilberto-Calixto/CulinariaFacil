package com.corevm.culinariafacil.presenter

import com.corevm.culinariafacil.data.ListFoodRemoteDataSource
import com.corevm.culinariafacil.model.ExtendedIngredient
import com.corevm.culinariafacil.model.ListCallck
import com.corevm.culinariafacil.model.Recipe
import com.corevm.culinariafacil.view.ListFoodFragment

class ListFoodPresenter(private val view: ListFoodFragment): ListCallck {

    private val data = ListFoodRemoteDataSource()

    //Buscar a lista de receitas
    fun findRecives() {
        data.findReceivesData(this)
    }

    override fun onSucess(list: List<Recipe>) {
        val nLis = list.get(0).extendedIngredients
        view.showList(nLis)
    }

    override fun onError(message: String) {

    }

    override fun complete() {

    }
}