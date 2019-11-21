package buu.lucio.cars


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.lucio.cars.databinding.FragmentPagethreeBinding

/**
 * A simple [Fragment] subclass.
 */
class PagethreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentPagethreeBinding>(inflater,R.layout.fragment_pagethree,container,false)

        binding.apply {
            val licenseEditText3 = binding.licenseEdit3
            val emtyBtn3 = binding.emtythreeButton
            val emty3 = binding.emty3Button

            emtyBtn3.text = licenseEditText3.text
            emty3.text = licenseEditText3.text
        }

        binding.submitButton3.setOnClickListener {view ->
            binding.apply {
                val licenseEditText3 = binding.licenseEdit3
                val emtyBtn3 = binding.emtythreeButton
                val emty3 = binding.emty3Button

                emtyBtn3.text = licenseEditText3.text
                emty3.text = licenseEditText3.text
            }
            view.findNavController().navigate(R.id.action_pagethreeFragment_to_titleFragment)
        }
        binding.deleteButton3.setOnClickListener {
            binding.apply {
                val licenseEditText3 = binding.licenseEdit3
                val emtyBtn3 = binding.emtythreeButton
                val emty3 = binding.emty3Button
                val delnameEditText3 = binding.nameEdit3
                val delbrandEditText3 = binding.brandEdit3
                val dellicenseEditText3 = binding.licenseEdit3

                delnameEditText3.getText().clear()
                delbrandEditText3.getText().clear()
                dellicenseEditText3.getText().clear()

                emtyBtn3.text = licenseEditText3.text
                emtyBtn3.text = "Emty"
                emty3.text = "Emty"
            }
        }
        return binding.root
    }


}
