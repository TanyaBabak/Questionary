package android.example.com.petproject.presentation.ui.settings

import android.example.com.petproject.R
import android.example.com.petproject.databinding.FragmentSettingsBinding
import android.example.com.petproject.extension.viewModel
import android.example.com.petproject.presentation.core.BaseFragment
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding

class SettingsFragment : BaseFragment(R.layout.fragment_settings) {
    private val binding: FragmentSettingsBinding by viewBinding()
    private lateinit var viewModel: SettingsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = viewModel(viewModelProvider) {

        }
    }
}