package com.example.shoestore.ui.instruction

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.shoestore.R
import com.example.shoestore.databinding.InstructionFragmentBinding
import com.example.shoestore.databinding.InstructionFragmentBinding.*

class InstructionFragment : Fragment() {

    private lateinit var binding:InstructionFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = InstructionFragmentBinding.inflate(inflater,container,false)
        val root : View = binding.root

        binding.instbut.setOnClickListener {
            findNavController().navigate(R.id.action_instructionFragment_to_listFragment2)
        }

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(InstructionViewModel::class.java)
//        // TODO: Use the ViewModel
//    }
    }
}