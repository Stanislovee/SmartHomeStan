package com.example.smarthome.ui.loginRegister

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.smarthome.AuthRepository
import com.example.smarthome.AuthRepositoryImpl
import com.example.smarthome.MainActivity
import com.example.smarthome.R
import com.example.smarthome.databinding.FragmentAuthBinding
import kotlinx.coroutines.launch

class AuthFragment : Fragment() {

    private var _binding: FragmentAuthBinding? = null
    private val binding get() = _binding!!
    private lateinit var authRepository: AuthRepository

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        _binding = FragmentAuthBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         authRepository = AuthRepositoryImpl()

        val imageStartActivity = binding.imageStartActivity
        val imageStartText = binding.imageStartText
        val btnStart = binding.btnStart

        val imageUpperLoginRegisterActivity = binding.imageUpperLoginRegisterActivity
        val imageLowerLoginRegisterActivity = binding.imageLowerLoginRegisterActivity
        val btnSignUpLoginRegisterActivity = binding.btnSignUpLoginRegisterActivity
        val btnLoginLoginRegisterActivity = binding.btnLoginLoginRegisterActivity

        val btnBackLoginActivity = binding.btnBackLoginActivity
        val textSignUpLoginActivity = binding.textSignUpLoginActivity
        val imageLoginActivity = binding.imageLoginActivity
        val textViewEmailLoginActivity = binding.textViewEmailLoginActivity
        val editTextTextEmailLoginActivity = binding.editTextTextEmailLoginActivity
        val textViewSetPasswordLoginActivity = binding.textViewSetPasswordLoginActivity
        val editTextTextPasswordRegisterActivity = binding.editTextTextPasswordRegisterActivity
        val btnForgotPassword = binding.btnForgotPassword
        val btnLoginToTempSettLoginActivity = binding.btnLoginToTempSettLoginActivity
        val textViewConstLoginActivity = binding.textViewConstLoginActivity
        val btnSignUpLoginActivity = binding.btnSignUpLoginActivity

        val btnBackRegisterActivity = binding.btnBackRegisterActivity
        val textViewSignUpRegisterActivity = binding.textViewSignUpRegisterActivity
        val textViewRegisterUpperRegisterActivity = binding.textViewRegisterUpperRegisterActivity
        val textViewFullNameRegisterActivity = binding.textViewFullNameRegisterActivity
        val editTextTextNameRegisterActivity = binding.editTextTextNameRegisterActivity
        val textViewEmailRegisterActivity = binding.textViewEmailRegisterActivity
        val editTextEmailRegisterActivity = binding.editTextEmailRegisterActivity
        val textViewSetPasswordRegisterActivity = binding.textViewSetPasswordRegisterActivity
        val editTextPasswordRegisterActivity = binding.editTextPasswordRegisterActivity
        val textViewConfirmPasswordRegisterActivity =
            binding.textViewConfirmPasswordRegisterActivity
        val editTextConfirmPasswordRegisterActivity =
            binding.editTextConfirmPasswordRegisterActivity
        val btnRegisterRegisterActivity = binding.btnRegisterRegisterActivity





        imageStartActivity.visibility = View.VISIBLE
        imageStartText.visibility = View.VISIBLE
        btnStart.visibility = View.VISIBLE

        imageUpperLoginRegisterActivity.visibility = View.GONE
        imageLowerLoginRegisterActivity.visibility = View.GONE
        btnSignUpLoginRegisterActivity.visibility = View.GONE
        btnLoginLoginRegisterActivity.visibility = View.GONE

        btnBackLoginActivity.visibility = View.GONE
        textSignUpLoginActivity.visibility = View.GONE
        imageLoginActivity.visibility = View.GONE
        textViewEmailLoginActivity.visibility = View.GONE
        editTextTextEmailLoginActivity.visibility = View.GONE
        textViewSetPasswordLoginActivity.visibility = View.GONE
        editTextTextPasswordRegisterActivity.visibility = View.GONE
        btnForgotPassword.visibility = View.GONE
        btnLoginToTempSettLoginActivity.visibility = View.GONE
        textViewConstLoginActivity.visibility = View.GONE
        btnSignUpLoginActivity.visibility = View.GONE

        btnBackRegisterActivity.visibility = View.GONE
        textViewSignUpRegisterActivity.visibility = View.GONE
        textViewRegisterUpperRegisterActivity.visibility = View.GONE
        textViewFullNameRegisterActivity.visibility = View.GONE
        editTextTextNameRegisterActivity.visibility = View.GONE
        textViewEmailRegisterActivity.visibility = View.GONE
        editTextEmailRegisterActivity.visibility = View.GONE
        textViewSetPasswordRegisterActivity.visibility = View.GONE
        editTextPasswordRegisterActivity.visibility = View.GONE
        textViewConfirmPasswordRegisterActivity.visibility = View.GONE
        editTextConfirmPasswordRegisterActivity.visibility = View.GONE
        btnRegisterRegisterActivity.visibility = View.GONE


        btnStart.setOnClickListener {

            imageStartActivity.visibility = View.GONE
            imageStartText.visibility = View.GONE
            btnStart.visibility = View.GONE


            imageUpperLoginRegisterActivity.visibility = View.VISIBLE
            imageLowerLoginRegisterActivity.visibility = View.VISIBLE
            btnSignUpLoginRegisterActivity.visibility = View.VISIBLE
            btnLoginLoginRegisterActivity.visibility = View.VISIBLE
        }


        btnSignUpLoginRegisterActivity.setOnClickListener {

            imageUpperLoginRegisterActivity.visibility = View.GONE
            imageLowerLoginRegisterActivity.visibility = View.GONE
            btnSignUpLoginRegisterActivity.visibility = View.GONE
            btnLoginLoginRegisterActivity.visibility = View.GONE


            btnBackRegisterActivity.visibility = View.VISIBLE
            textViewSignUpRegisterActivity.visibility = View.VISIBLE
            textViewRegisterUpperRegisterActivity.visibility = View.VISIBLE
            textViewFullNameRegisterActivity.visibility = View.VISIBLE
            editTextTextNameRegisterActivity.visibility = View.VISIBLE
            textViewEmailRegisterActivity.visibility = View.VISIBLE
            editTextEmailRegisterActivity.visibility = View.VISIBLE
            textViewSetPasswordRegisterActivity.visibility = View.VISIBLE
            editTextPasswordRegisterActivity.visibility = View.VISIBLE
            textViewConfirmPasswordRegisterActivity.visibility = View.VISIBLE
            editTextConfirmPasswordRegisterActivity.visibility = View.VISIBLE
            btnRegisterRegisterActivity.visibility = View.VISIBLE
        }


        btnLoginLoginRegisterActivity.setOnClickListener {

            imageUpperLoginRegisterActivity.visibility = View.GONE
            imageLowerLoginRegisterActivity.visibility = View.GONE
            btnSignUpLoginRegisterActivity.visibility = View.GONE
            btnLoginLoginRegisterActivity.visibility = View.GONE


            btnBackLoginActivity.visibility = View.VISIBLE
            textSignUpLoginActivity.visibility = View.VISIBLE
            imageLoginActivity.visibility = View.VISIBLE
            textViewEmailLoginActivity.visibility = View.VISIBLE
            editTextTextEmailLoginActivity.visibility = View.VISIBLE
            textViewSetPasswordLoginActivity.visibility = View.VISIBLE
            editTextTextPasswordRegisterActivity.visibility = View.VISIBLE
            btnForgotPassword.visibility = View.VISIBLE
            btnLoginToTempSettLoginActivity.visibility = View.VISIBLE
            textViewConstLoginActivity.visibility = View.VISIBLE
            btnSignUpLoginActivity.visibility = View.VISIBLE
        }


        btnBackLoginActivity.setOnClickListener {

            btnBackLoginActivity.visibility = View.GONE
            textSignUpLoginActivity.visibility = View.GONE
            imageLoginActivity.visibility = View.GONE
            textViewEmailLoginActivity.visibility = View.GONE
            editTextTextEmailLoginActivity.visibility = View.GONE
            textViewSetPasswordLoginActivity.visibility = View.GONE
            editTextTextPasswordRegisterActivity.visibility = View.GONE
            btnForgotPassword.visibility = View.GONE
            btnLoginToTempSettLoginActivity.visibility = View.GONE
            textViewConstLoginActivity.visibility = View.GONE
            btnSignUpLoginActivity.visibility = View.GONE


            imageUpperLoginRegisterActivity.visibility = View.VISIBLE
            imageLowerLoginRegisterActivity.visibility = View.VISIBLE
            btnSignUpLoginRegisterActivity.visibility = View.VISIBLE
            btnLoginLoginRegisterActivity.visibility = View.VISIBLE
        }


        btnBackRegisterActivity.setOnClickListener {

            btnBackRegisterActivity.visibility = View.GONE
            textViewSignUpRegisterActivity.visibility = View.GONE
            textViewRegisterUpperRegisterActivity.visibility = View.GONE
            textViewFullNameRegisterActivity.visibility = View.GONE
            editTextTextNameRegisterActivity.visibility = View.GONE
            textViewEmailRegisterActivity.visibility = View.GONE
            editTextEmailRegisterActivity.visibility = View.GONE
            textViewSetPasswordRegisterActivity.visibility = View.GONE
            editTextPasswordRegisterActivity.visibility = View.GONE
            textViewConfirmPasswordRegisterActivity.visibility = View.GONE
            editTextConfirmPasswordRegisterActivity.visibility = View.GONE
            btnRegisterRegisterActivity.visibility = View.GONE

            imageUpperLoginRegisterActivity.visibility = View.VISIBLE
            imageLowerLoginRegisterActivity.visibility = View.VISIBLE
            btnSignUpLoginRegisterActivity.visibility = View.VISIBLE
            btnLoginLoginRegisterActivity.visibility = View.VISIBLE

            btnLoginToTempSettLoginActivity.setOnClickListener {

                (activity as MainActivity).showBottomNavigation()

                findNavController().navigate(R.id.navigation_temperature_settings)
            }

            btnRegisterRegisterActivity.setOnClickListener {

                (activity as MainActivity).showBottomNavigation()

                findNavController().navigate(R.id.navigation_temperature_settings)
            }
            btnLoginToTempSettLoginActivity.setOnClickListener {
                val email = editTextTextEmailLoginActivity.text.toString()
                val password = editTextTextPasswordRegisterActivity.text.toString()

                if (email.isNotEmpty() && password.isNotEmpty()) {
                    loginUser(email, password)
                } else {
                    Toast.makeText(requireContext(), "Please fill all fields", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
    }
    private fun loginUser(email: String, password: String) {
        lifecycleScope.launch {
            try {
                val response = authRepository.login(email, password)
                when (response.status.value) {
                    200 -> {
                        Toast.makeText(requireContext(), "Login successful", Toast.LENGTH_SHORT).show()
                        (activity as MainActivity).showBottomNavigation()
                        findNavController().navigate(R.id.navigation_temperature_settings)
                    }
                    400 -> {
                        Toast.makeText(requireContext(), "All fields must be filled in.", Toast.LENGTH_SHORT).show()
                    }
                    401 -> {
                        Toast.makeText(requireContext(), "Incorrect password.", Toast.LENGTH_SHORT).show()
                    }
                    404 -> {
                        Toast.makeText(requireContext(), "User with this email not found.", Toast.LENGTH_SHORT).show()
                    }
                    else -> {
                        Toast.makeText(requireContext(), "An unexpected error occurred.", Toast.LENGTH_SHORT).show()
                    }
                }
            } catch (e: Exception) {
                Toast.makeText(requireContext(), "An error occurred: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}





