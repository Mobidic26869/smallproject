package buu.lucio.cars


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.lucio.cars.databinding.FragmentPagetwoBinding

/**
 * A simple [Fragment] subclass.
 */
class PagetwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentPagetwoBinding>(inflater,R.layout.fragment_pagetwo,container,false)

        binding.apply {
            val licenseEditText2 = binding.licenseEdit2
            val emtyBtn2 = binding.emtytwoButton
            val emty2 = binding.emty2Button

            emtyBtn2.text = licenseEditText2.text
            emty2.text = licenseEditText2.text
        }
        binding.submitButton2.setOnClickListener {view ->
            binding.apply {
                val licenseEditText2 = binding.licenseEdit2
                val emtyBtn2 = binding.emtytwoButton
                val emty2 = binding.emty2Button

                emtyBtn2.text = licenseEditText2.text
                emty2.text = licenseEditText2.text
            }
            view.findNavController().navigate(R.id.action_pagetwoFragment_to_titleFragment)
        }
        binding.deleteButton2.setOnClickListener {
            binding.apply {

                val licenseEditText2 = binding.licenseEdit2
                val emtyBtn2 = binding.emtytwoButton
                val emty2 = binding.emty2Button
                val delnameEditText2 = binding.nameEdit2
                val delbrandEditText2 = binding.brandEdit2
                val dellicenseEditText2 = binding.licenseEdit2

                delnameEditText2.getText().clear()
                delbrandEditText2.getText().clear()
                dellicenseEditText2.getText().clear()

                emtyBtn2.text = licenseEditText2.text
                emtyBtn2.text = "Emty"
                emty2.text = "Emty"
            }
        }
        return binding.root
    }


}
