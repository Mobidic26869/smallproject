package buu.lucio.cars


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.lucio.cars.databinding.FragmentLoginBinding
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater,R.layout.fragment_login,container,false)

        binding.loginButton.setOnClickListener {view ->

            if(user_EditText.text.toString().equals("pimnipa") && Pass_editText.text.toString().equals("1234"))
                Toast.makeText(context,"Login Successfully", Toast.LENGTH_SHORT).show().run { view.findNavController().navigate(R.id.action_loginFragment2_to_titleFragment)}
            else Toast.makeText(context,"Login Fail", Toast.LENGTH_SHORT).show().run { view.findNavController().navigate(R.id.action_loginFragment2_self)}

        }

        return binding.root
    }


}
