package com.corevm.culinariafacil.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.corevm.culinariafacil.R
import com.corevm.culinariafacil.utils.Onclicklister
import com.corevm.culinariafacil.viewmodel.ListFoodViewModel

class ListFoodFragment: Fragment(), Onclicklister {

    private val viewModel: ListFoodViewModel by viewModels()


    private lateinit var progress: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
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

        viewModel.getListFood()

        val rcv: RecyclerView? = view.findViewById(R.id.rcv_list_food)
        rcv?.layoutManager = LinearLayoutManager(requireContext())
        val adapter = ListFoodAdapter(this)
        rcv?.adapter = adapter

        viewModel.allRecipes.observe(viewLifecycleOwner, Observer {
            adapter.addList(it)
            adapter.notifyDataSetChanged()
        })

        viewModel.errorMessage.observe(viewLifecycleOwner, Observer {
            Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
        })

        viewModel.allImgsUrls.observe(viewLifecycleOwner, Observer { urls ->
            adapter.addurls(urls)

        })


        //Configurar ButtomNavigation
        val serch: SearchView = view.findViewById(R.id.search_main)
        serch.setOnQueryTextListener( object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {

                query?.let {
                    //Realizar busca comfoeme o necessário
                }

                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                newText?.let {
                    //Realizar busca incremental conforme o texto muda
                }

                return false
            }

        })

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.opptions_main, menu)

        val serachItem = menu.findItem(R.id.search_main)
        val searchView = serachItem?.actionView as SearchView

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {

                query?.let {

                }

                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                newText?.let {

                }

                return false
            }

        })

    }

    override fun onItemClick(id: Int) {

        val action = ListFoodFragmentDirections.actionNavAllToNavItem2()
        findNavController().navigate(action)

        Toast.makeText(requireContext(), "Click", Toast.LENGTH_SHORT).show()
    }


    fun showProgress(){
        progress.visibility = View.VISIBLE
    }
    fun hideProgress(){
        progress.visibility = View.GONE
    }



}