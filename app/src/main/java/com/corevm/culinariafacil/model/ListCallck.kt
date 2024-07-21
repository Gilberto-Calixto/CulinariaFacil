package com.corevm.culinariafacil.model

interface ListCallck {

    fun omSucess(list: MutableList<Reciver>)

    fun onError()

    fun complete()
}