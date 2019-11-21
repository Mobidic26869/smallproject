package buu.lucio.cars


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.lucio.cars.databinding.FragmentLoginBinding
import buu.lucio.cars.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,R.layout.fragment_title,container,false)


        binding.emtyoneButton.setOnClickListener {view ->
            view.findNavController().navigate(R.id.action_titleFragment_to_pageoneFragment)
        }
        binding.emtytwoButton.setOnClickListener {view ->
            view.findNavController().navigate(R.id.action_titleFragment_to_pagetwoFragment)
        }
        binding.emtythreeButton.setOnClickListener {view ->
            view.findNavController().navigate(R.id.action_titleFragment_to_pagethreeFragment)
        }


        return binding.root
    }






}
