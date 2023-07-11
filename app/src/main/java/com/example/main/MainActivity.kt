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
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        navController = navHostFragment.navController

        bottomNavigationView = findViewById<BottomNavigationView>(R.id.bnv_main)?.apply {
            setupWithNavController(navController)
        } ?: return

        navController.addOnDestinationChangedListener { _, destination, _ ->
            bottomNavigationView.visibility =
                if (isBottomNavigationViewVisible(destination.id)) {
                    View.VISIBLE
                } else {
                    View.GONE
                }
        }
    }

    private fun isBottomNavigationViewVisible(destinationId: Int): Boolean {
        return when (destinationId) {
            R.id.homeFragment2, R.id.quotesFragment2, R.id.artFragment -> true
            else -> false
        }
    }
}
