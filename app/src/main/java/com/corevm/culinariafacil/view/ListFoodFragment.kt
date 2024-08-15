package com.corevm.culinariafacil.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.navigation.fragment.findNavController
import com.corevm.culinariafacil.R
import com.corevm.culinariafacil.model.Onclicklister
import com.corevm.culinariafacil.model.Recipe
import com.corevm.culinariafacil.presenter.ListFoodPresenter

class ListFoodFragment: Fragment(), Onclicklister {

    private lateinit var progress: ProgressBar
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

        progress = view.findViewById(R.id.progress_list)
        presenter.findRecives()


    }

    override fun onItemClick(id: Int) {

        val action = ListFoodFragmentDirections.actionNavAllToNavItem2()
        findNavController().navigate(action)

        Toast.makeText(requireContext(), "Click", Toast.LENGTH_SHORT).show()
    }

    fun showList(recipes: List<Recipe>) {

        val ingredients = recipes.flatMap { it.extendedIngredients }
        // Junta todos os ingredientes em uma única lista

        val imageUrls = recipes.map { it.image }
        // Cria uma lista com as URLs das imagens


        val rcv: RecyclerView? = view?.findViewById(R.id.rcv_list_food)
        rcv?.layoutManager = LinearLayoutManager(requireContext())
        val adapter = ListFoodAdapter(recipes, imageUrls, this)


        rcv?.adapter = adapter

    }

    fun showProgress(){
        progress.visibility = View.VISIBLE
    }
    fun hideProgress(){
        progress.visibility = View.GONE
    }



}