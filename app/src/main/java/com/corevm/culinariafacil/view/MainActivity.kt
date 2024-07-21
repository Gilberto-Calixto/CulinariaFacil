package com.corevm.culinariafacil.view

import android.os.Bundle
import android.view.Menu
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.corevm.culinariafacil.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Sincronizando os elementos
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        val bottomNagivationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNagivationView.setupWithNavController(navController)

        //Configurar ButtomNavigation
        val serch: SearchView = findViewById(R.id.search_main)
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.opptions_main, menu)

        val serachItem = menu?.findItem(R.id.search_main)
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

        return true
    }
}