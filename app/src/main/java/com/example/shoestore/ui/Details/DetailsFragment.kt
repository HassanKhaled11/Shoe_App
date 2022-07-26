package com.example.shoestore.ui.Details

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.shoestore.R
import com.example.shoestore.databinding.DetailsFragmentBinding
import com.example.shoestore.model.Sharedviewmodel
import com.example.shoestore.model.Shoe

class DetailsFragment : Fragment() {


    private lateinit var binding: DetailsFragmentBinding
     private var myShoe:Shoe = Shoe("","","","")
    private lateinit var myviewmodel: Sharedviewmodel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DetailsFragmentBinding.inflate(inflater, container, false)
        var root: View = binding.root



        binding.lifecycleOwner = this

        binding.myShoe = myShoe


        myviewmodel = ViewModelProvider(requireActivity())[Sharedviewmodel::class.java]


        binding.cancelButton.setOnClickListener {
            findNavController().navigate(R.id.action_detailsFragment_to_listFragment)
        }


        binding.saveButton.setOnClickListener {

           myviewmodel.addshoe(myShoe)

            findNavController().navigate(R.id.action_detailsFragment_to_listFragment)
        }
            return root
        }



}