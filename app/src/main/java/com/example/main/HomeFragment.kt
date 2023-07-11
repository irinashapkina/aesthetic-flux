package com.example.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textViewPostImpressionism = view.findViewById<TextView>(R.id.tv_postimpressionism)
        val textViewDivisionism = view.findViewById<TextView>(R.id.tv_divisionism)
        val textViewAbstractionism = view.findViewById<TextView>(R.id.tv_abstractionism)
        val textViewCaravaggism = view.findViewById<TextView>(R.id.tv_caravaggism)
        val textViewAnachronism = view.findViewById<TextView>(R.id.tv_anachronism)

        textViewPostImpressionism.setOnClickListener {
            navigateToFragment(R.id.action_homeFragment2_to_postimpressionismFragment2)
        }

        textViewDivisionism.setOnClickListener {
            navigateToFragment(R.id.action_homeFragment2_to_divisionismFragment)
        }

        textViewAbstractionism.setOnClickListener {
            navigateToFragment(R.id.action_homeFragment2_to_abstractionismFragment)
        }

        textViewCaravaggism.setOnClickListener {
            navigateToFragment(R.id.action_homeFragment2_to_caravaggismFragment)
        }

        textViewAnachronism.setOnClickListener {
            navigateToFragment(R.id.action_homeFragment2_to_anachronismFragment)
        }
    }

    private fun navigateToFragment(actionId: Int) {
        val navController = findNavController()
        navController.navigate(actionId)
    }
}



