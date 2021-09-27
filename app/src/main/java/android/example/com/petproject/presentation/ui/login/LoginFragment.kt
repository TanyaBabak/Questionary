package android.example.com.petproject.presentation.ui.login

import android.example.com.petproject.R
import android.example.com.petproject.databinding.FragmentLoginBinding
import android.example.com.petproject.extension.viewModel
import android.example.com.petproject.presentation.core.BaseFragment
import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import by.kirich1409.viewbindingdelegate.viewBinding

class LoginFragment : BaseFragment(R.layout.fragment_login) {

    private val binding: FragmentLoginBinding by viewBinding()
    private lateinit var viewModel: LoginViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = viewModel(viewModelProvider) {

        }
        binding.button.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_loginFragment_to_mainFragment,
                null
            )
        )
    }
}