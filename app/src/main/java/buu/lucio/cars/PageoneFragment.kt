package buu.lucio.cars


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.lucio.cars.databinding.FragmentPageoneBinding

/**
 * A simple [Fragment] subclass.
 */
class PageoneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentPageoneBinding>(inflater,R.layout.fragment_pageone,container,false)

        binding.apply {
            val licenseEditText = binding.licenseEdit
            val emtyBtn1 = binding.emtyoneButton
            val emty1 = binding.emty1Button

            emtyBtn1.text = licenseEditText.text
            emty1.text = licenseEditText.text
        }

        binding.submitButton1.setOnClickListener {view ->
            binding.apply {
                val licenseEditText = binding.licenseEdit
                val emtyBtn1 = binding.emtyoneButton
                val emty1 = binding.emty1Button

                emtyBtn1.text = licenseEditText.text
                emty1.text = licenseEditText.text

            }
           view.findNavController().navigate(R.id.action_pageoneFragment_to_titleFragment)
        }
        binding.deleteButton1.setOnClickListener {
            binding.apply {
                val licenseEditText = binding.licenseEdit
                val emtyBtn1 = binding.emtyoneButton
                val emty1 = binding.emty1Button
                val delnameEditText = binding.nameEdit
                val delbrandEditText = binding.brandEdit
                val dellicenseEditText = binding.licenseEdit

                delnameEditText.getText().clear()
                delbrandEditText.getText().clear()
                dellicenseEditText.getText().clear()

                emtyBtn1.text = licenseEditText.text
                emtyBtn1.text = "Emty"
                emty1.text = "Emty"
            }
        }
        return binding.root
    }


}
