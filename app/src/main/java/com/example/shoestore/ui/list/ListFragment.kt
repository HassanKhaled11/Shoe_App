package com.example.shoestore.ui.list

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.provider.CalendarContract
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.core.view.marginBottom
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.shoestore.R
import com.example.shoestore.databinding.ActivityMainBinding.inflate
import com.example.shoestore.databinding.AppBarMainBinding.inflate
import com.example.shoestore.databinding.ListFragmentBinding
import com.example.shoestore.model.Sharedviewmodel
import com.google.android.material.snackbar.Snackbar

class ListFragment : Fragment() {

    private lateinit var binding: ListFragmentBinding
    private lateinit var viewModel: Sharedviewmodel
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var linearLayout: LinearLayout

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding = ListFragmentBinding.inflate(inflater, container, false)
        var root: View = binding.root

        viewModel = ViewModelProvider(requireActivity())[Sharedviewmodel::class.java]

        binding.lifecycleOwner = this
        binding.viewmodel = viewModel



        linearLayout = binding.linearlayout1


        binding.fab.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_detailsFragment)
        }

        setHasOptionsMenu(true)



        viewModel.shoelist.observe(viewLifecycleOwner) {


            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout
                    .LayoutParams.WRAP_CONTENT
            )


            val llparams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout
                    .LayoutParams.MATCH_PARENT
            )


            llparams.setMargins(0, 20, 0, 80)


            it.forEachIndexed { index, shoe ->
                val txtview = TextView(requireActivity())
                val txtview2 = TextView(requireActivity())
                val txtview3 = TextView(requireActivity())
                val txtview4 = TextView(requireActivity())


                val ll = LinearLayout(requireActivity())
                ll.setOrientation(LinearLayout.VERTICAL)
                ll.setBackgroundColor(Color.parseColor("#355355"))


                txtview.setText(shoe.name)
                txtview.setTextSize(25F)
                txtview.setPadding(20, 0, 10, 0)

                txtview2.setText(shoe.size)
                txtview2.setTextSize(25F)
                txtview2.setPadding(20, 0, 10, 0)


                txtview3.setText(shoe.company)
                txtview3.setTextSize(25F)
                txtview3.setPadding(20, 0, 10, 0)


                txtview4.setText(shoe.describtion)
                txtview4.setTextSize(25F)
                txtview4.setPadding(20, 0, 10, 0)



                ll.addView(txtview, params)
                ll.addView(txtview2, params)
                ll.addView(txtview3, params)
                ll.addView(txtview4, params)

                linearLayout.addView(ll, llparams)

            }

        }

        return root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.logout_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return NavigationUI.onNavDestinationSelected(item,requireView().findNavController())||

        when(item.itemId){
            R.id.loginFragment->findNavController().navigate(R.id.action_listFragment_to_loginFragment)
        }
        return  super.onOptionsItemSelected(item)
    }



}