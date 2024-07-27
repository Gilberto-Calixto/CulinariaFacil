package com.corevm.culinariafacil.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.corevm.culinariafacil.R
import com.corevm.culinariafacil.model.ExtendedIngredient
import com.corevm.culinariafacil.model.Recipe
import com.corevm.culinariafacil.presenter.ListFoodPresenter

class ListFoodFragment: Fragment() {

    private lateinit var presenter: ListFoodPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        presenter = ListFoodPresenter(this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list_food, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        presenter.findRecives()


    }

    fun showList(list: List<ExtendedIngredient>) {
        val adapter = ListFoodAdapter(list)
        val rcv: RecyclerView? = view?.findViewById(R.id.rcv_list_food)
        rcv?.layoutManager = LinearLayoutManager(requireContext())
        rcv?.adapter = adapter
    }
}