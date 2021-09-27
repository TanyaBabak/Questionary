package ua.fuel.di.viewmodel

import android.example.com.petproject.presentation.di.viewmodel.ViewModelKey
import android.example.com.petproject.presentation.ui.login.LoginViewModel
import android.example.com.petproject.presentation.ui.questionary.QuestionaryViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(QuestionaryViewModel::class)
    abstract fun bindViewModel(viewModel: QuestionaryViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindMapXViewModel(viewModel: LoginViewModel): ViewModel


}