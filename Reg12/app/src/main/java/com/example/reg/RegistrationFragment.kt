package com.example.reg

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.reg.databinding.FragmentRegistrationBinding

class RegistrationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_registration, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val userName: EditText = view.findViewById(R.id.etNameReg)
        val userLogin: EditText = view.findViewById(R.id.etLoginReg)
        val userPass: EditText = view.findViewById(R.id.etPassReg)
        val button: Button = view.findViewById(R.id.bReg)

        button.setOnClickListener {
            val name = userName.text.toString().trim()
            val login = userLogin.text.toString().trim()
            val pass = userPass.text.toString().trim()

            if (name.isEmpty() || name.length > 25) {
                Toast.makeText(requireContext(), "Пожалуйста, введите имя.", Toast.LENGTH_LONG).show()
            } else if (login.isEmpty() || login.length > 25) {
                Toast.makeText(requireContext(), "Пожалуйста, введите логин.", Toast.LENGTH_LONG).show()
            } else if (pass.isEmpty() || pass.length > 25) {
                Toast.makeText(requireContext(), "Пожалуйста, введите пароль.", Toast.LENGTH_LONG).show()
            } else {
                val user = User(name, login, pass)

                val db = DbHelper(requireContext(), null)
                db.addUser(user)
                Toast.makeText(requireContext(), "Пользователь, $name добавлен.", Toast.LENGTH_LONG).show()

                userName.text.clear()
                userLogin.text.clear()
                userPass.text.clear()

                findNavController().navigate(R.id.action_registrationFragment_to_authorizeFragment2)

            }
        }
    }
}