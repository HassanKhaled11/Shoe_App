package com.example.shoestore.ui.login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.shoestore.R
import com.example.shoestore.databinding.LoginFragmentBinding

class LoginFragment : Fragment() {

    private lateinit var binding:LoginFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LoginFragmentBinding.inflate(inflater, container, false)
        val root:View = binding.root

        binding.signbut.setOnClickListener {

            findNavController().navigate(R.id.action_loginFragment_to_welcomeFragment)
        }

        binding.logbut.setOnClickListener {

            findNavController().navigate(R.id.action_loginFragment_to_welcomeFragment)
        }

        binding.forgetbut.setOnClickListener{

            findNavController().navigate(R.id.action_loginFragment_to_welcomeFragment)

        }

        return root
    }



}