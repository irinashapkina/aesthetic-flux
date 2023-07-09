package com.example.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        navController = navHostFragment.navController

        findViewById<BottomNavigationView>(R.id.bnv_main)?.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            findViewById<BottomNavigationView>(R.id.bnv_main)?.visibility =
                if (isBottomNavigationViewVisible(destination.id)) {
                    View.VISIBLE
                } else {
                    View.GONE
                }
        }
    }

    private fun isBottomNavigationViewVisible(destinationId: Int): Boolean {
        return destinationId == R.id.homeFragment2 || destinationId == R.id.quotesFragment2 ||
                destinationId == R.id.artFragment
    }
}