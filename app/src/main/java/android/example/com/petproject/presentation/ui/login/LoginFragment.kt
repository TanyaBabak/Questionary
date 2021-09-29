package android.example.com.petproject.presentation.ui.login

import android.example.com.petproject.R
import android.example.com.petproject.databinding.FragmentLoginBinding
import android.example.com.petproject.domain.model.Account
import android.example.com.petproject.exception.Failure
import android.example.com.petproject.extension.observe
import android.example.com.petproject.extension.viewModel
import android.example.com.petproject.presentation.core.BaseFragment
import android.example.com.petproject.presentation.di.Injector
import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding

class LoginFragment : BaseFragment(R.layout.fragment_login) {

    private val binding: FragmentLoginBinding by viewBinding()
    private lateinit var viewModel: LoginViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Injector.applicationComponent!!.inject(this)
        viewModel = viewModel(viewModelProvider) {
            observe(idAccountLifeData, ::hideProgress)
            observe(failureLiveData, ::showError)
        }
        binding.button.setOnClickListener {
            binding.progress.visibility = View.VISIBLE
            viewModel.addAccount(
                Account(
                    1233,
                    "Tanya",
                    "Babak",
                    "12.05.1997",
                    "Bakulina",
                    "tango",
                    arrayListOf("Dance")
                )
            )
        }
//            Navigation.createNavigateOnClickListener(
//                R.id.action_loginFragment_to_mainFragment,
//                null
//            )
    }

    fun hideProgress(idAccount: Long) {
            binding.progress.visibility = View.GONE
    }

    private fun showError(failure: Failure) {
        binding.progress.visibility = View.GONE
    }
}