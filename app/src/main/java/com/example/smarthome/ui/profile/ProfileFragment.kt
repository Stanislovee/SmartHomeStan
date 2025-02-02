package com.example.smarthome.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.smarthome.AuthRepositoryImpl
import com.example.smarthome.R
import com.example.smarthome.databinding.FragmentProfileBinding
import com.example.smarthome.ui.notification.NotificationFragment
import kotlinx.coroutines.launch

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    private val authRepository = AuthRepositoryImpl()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.imageButtonNotificationUpper.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_profile_to_navigation_notifications)

        }


        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        makeTestRequestToServer()
    }

    private fun makeTestRequestToServer() {
        lifecycleScope.launch {
            val response = authRepository.registerUser("email", "pass", "name")
            Toast.makeText(
                requireActivity(),
                "response received${response.status}",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
