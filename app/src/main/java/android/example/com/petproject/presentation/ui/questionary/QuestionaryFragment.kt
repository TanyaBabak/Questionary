package android.example.com.petproject.presentation.ui.questionary

import android.example.com.petproject.R
import android.example.com.petproject.databinding.FragmentQuestionaryBinding
import android.example.com.petproject.extension.viewModel
import android.example.com.petproject.presentation.core.BaseFragment
import android.example.com.petproject.presentation.di.Injector
import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding


class QuestionaryFragment : BaseFragment(R.layout.fragment_questionary) {

    private val binding: FragmentQuestionaryBinding by viewBinding()
    private lateinit var viewModel: QuestionaryViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Injector.applicationComponent!!.injectQuestionatyFragment(this)
        viewModel = viewModel(viewModelProvider) {

        }

    }
}