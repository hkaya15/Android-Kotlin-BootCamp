package com.example.bootcamp

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.Navigation.createNavigateOnClickListener
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import com.example.bootcamp.R.id
import com.example.bootcamp.databinding.ActivityMainBinding
import com.example.bootcamp.databinding.FragmentNavigationHomeBinding
import com.google.android.material.button.MaterialButton

class NavigationHomeFragment : Fragment() {

   private lateinit var  binding:FragmentNavigationHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_navigation_home, container, false)
    }

 /*  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    /*   NavigationHomeFragmentDirections.actionNavigationHomeFragmentToNavigationDetailFragment()
        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_navigationHomeFragment_to_navigationDetailFragment)
        },13000)*/
    }*/
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val otherbinding=FragmentNavigationHomeBinding.bind(view)
        binding=otherbinding
        binding.detaay.setOnClickListener{
            val name= binding.HeadName.text
            val direction=NavigationHomeFragmentDirections.actionNavigationHomeFragmentToNavigationDetailFragment(name.toString())
            findNavController().navigate(direction)
        }
    }


}