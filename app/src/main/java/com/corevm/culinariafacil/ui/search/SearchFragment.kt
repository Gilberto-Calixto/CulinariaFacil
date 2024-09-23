package com.corevm.culinariafacil.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import com.corevm.culinariafacil.R

class SearchFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search_foods, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

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
}