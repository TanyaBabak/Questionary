package android.example.com.petproject.presentation.ui

import android.example.com.petproject.R
import android.example.com.petproject.databinding.FragmentHomeBinding
import android.example.com.petproject.presentation.core.BaseFragment
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeFragment : BaseFragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bottomNavigationView = view.findViewById<BottomNavigationView>(R.id.bottom_bar)
        val navController =
            (childFragmentManager.findFragmentById(R.id.mainContainerView) as NavHostFragment).navController
        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }
}