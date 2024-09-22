package com.corevm.culinariafacil.ui

import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.WindowInsetsController
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.corevm.culinariafacil.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Mudar as cores da barra de notificações
        window.insetsController?.setSystemBarsAppearance(WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
            WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS) // mudando cor dos icones de acordo com tema do system
        window.statusBarColor = ContextCompat.getColor(this, R.color.orange)



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