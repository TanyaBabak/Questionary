package android.example.com.petproject.presentation.ui

import android.example.com.petproject.R
import android.example.com.petproject.databinding.FragmentSplashBinding
import android.example.com.petproject.presentation.core.BaseFragment
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.navigation.Navigation
import by.kirich1409.viewbindingdelegate.viewBinding

class SplashFragment : BaseFragment(R.layout.fragment_splash) {
    private val binding: FragmentSplashBinding by viewBinding()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_splashFragment_to_loginFragment,
                null
            )
        )
    }
}