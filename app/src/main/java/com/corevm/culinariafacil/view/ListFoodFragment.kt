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

class ListFoodFragment: Fragment() {

    private lateinit var adapter: ListFoodAdapter
    private lateinit var list: MutableList<Reciver>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list_food, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        list = mutableListOf(
            Reciver("Carro", ""),
            Reciver("Carro", ""),
            Reciver("Carro", ""),
            Reciver("Carro", ""),
            Reciver("Carro", ""),
            Reciver("Carro", ""),
            Reciver("Carro", "")
        )

        val rcv: RecyclerView = view.findViewById(R.id.rcv_list_food)
        rcv.layoutManager = LinearLayoutManager(requireContext())

        adapter = ListFoodAdapter(list)
        rcv.adapter = adapter
    }
}