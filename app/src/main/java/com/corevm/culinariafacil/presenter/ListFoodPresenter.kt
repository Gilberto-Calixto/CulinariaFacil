package com.corevm.culinariafacil.presenter

import com.corevm.culinariafacil.data.ListFoodRemoteDataSource
import com.corevm.culinariafacil.model.ListCallck
import com.corevm.culinariafacil.model.Reciver
import com.corevm.culinariafacil.view.ListFoodFragment

class ListFoodPresenter(private val view: ListFoodFragment): ListCallck {

    private val data = ListFoodRemoteDataSource()

    //Buscar a lista de receitas
    fun findRecives() {
        data.findReceivesData(this)
    }

    override fun omSucess(list: MutableList<Reciver>) {
        view.showList(list)
    }

    override fun onError() {

    }

    override fun complete() {

    }
}