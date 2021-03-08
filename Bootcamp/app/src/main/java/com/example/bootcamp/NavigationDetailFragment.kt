package com.example.bootcamp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.bootcamp.databinding.FragmentNavigationDetailBinding
import com.example.bootcamp.databinding.FragmentNavigationHomeBinding


class NavigationDetailFragment : Fragment() {

    val arguman :NavigationDetailFragmentArgs by navArgs()

    private lateinit var binding: FragmentNavigationDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentNavigationDetailBinding.inflate(LayoutInflater.from(requireContext()),container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val otherbinding=FragmentNavigationDetailBinding.bind(view)
        binding=otherbinding
        binding.textViewDogName.text=arguman.puppyName
    }

}