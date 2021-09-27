package android.example.com.petproject.presentation.core

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

abstract class BaseFragment(private val layoutId: Int) : Fragment(layoutId) {

    @Inject
    lateinit var viewModelProvider: ViewModelProvider.Factory

}