package com.corevm.culinariafacil.presenter

import com.corevm.culinariafacil.data.ListFoodRemoteDataSource
import com.corevm.culinariafacil.model.ListCallck
import com.corevm.culinariafacil.model.Recipe
import com.corevm.culinariafacil.view.ListFoodFragment

class ListFoodPresenter(private val view: ListFoodFragment): ListCallck {

    private val data = ListFoodRemoteDataSource()

    //Buscar a lista de receitas
    fun findRecives() {
        view.showProgress()
        data.findReceivesData(this)
    }

    override fun onSucess(recipe: List<Recipe>) {

        view.showList(recipe)
    }

    override fun onError(message: String) {

        view.hideProgress()
    }

    override fun complete() {
        view.hideProgress()
    }
}