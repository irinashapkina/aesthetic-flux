package com.example.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.main.databinding.FragmentAuthorizeBinding

class AuthorizeFragment : Fragment() {
    private var _binding: FragmentAuthorizeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAuthorizeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val userLogin: EditText = binding.etLoginAut
        val userPass: EditText = binding.etPassAut
        val button: Button = binding.bAut

        button.setOnClickListener {

            val login = userLogin.text.toString().trim()
            val pass = userPass.text.toString().trim()

            if (login.isEmpty() || login.length > 25) {
                Toast.makeText(
                    requireContext(),
                    getString(R.string.toast_login),
                    Toast.LENGTH_LONG
                ).show()
            } else if (pass.isEmpty() || pass.length > 25) {
                Toast.makeText(
                    requireContext(), getString(R.string.toast_pass),
                    Toast.LENGTH_LONG
                ).show()
            } else {

                val db = DbHelper(requireContext(), null)
                val isAuth = db.getUser(login, pass)

                if (isAuth) {
                    findNavController().navigate(R.id.action_authorizeFragment_to_beginningFragment)
                } else {
                    Toast.makeText(
                        requireContext(),
                        getString(R.string.toast_user),
                        Toast.LENGTH_LONG
                    ).show()
                    userLogin.text.clear()
                    userPass.text.clear()
                }
            }
        }
        binding.tvLinkToReg.setOnClickListener {
            findNavController().navigate(R.id.action_authorizeFragment_to_registrationFragment2)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
