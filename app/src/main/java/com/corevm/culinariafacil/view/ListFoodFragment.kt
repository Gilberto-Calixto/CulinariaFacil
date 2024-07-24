package com.corevm.culinariafacil.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.corevm.culinariafacil.R
import com.corevm.culinariafacil.model.Reciver
import com.corevm.culinariafacil.presenter.ListFoodPresenter

class ListFoodFragment: Fragment() {

    private val adapter = ListFoodAdapter()
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

        val rcv: RecyclerView = view.findViewById(R.id.rcv_list_food)
        rcv.layoutManager = LinearLayoutManager(requireContext())
        rcv.adapter = adapter
    }

    fun showList(list: List<Reciver>) {
        adapter.list(list)
    }
}