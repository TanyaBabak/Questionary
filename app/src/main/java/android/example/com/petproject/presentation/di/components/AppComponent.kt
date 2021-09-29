package android.example.com.petproject.presentation.di.components

import android.content.Context
import android.example.com.petproject.MainActivity
import android.example.com.petproject.presentation.di.modules.DataModule
import android.example.com.petproject.presentation.ui.login.LoginFragment
import android.example.com.petproject.presentation.ui.questionary.QuestionaryFragment
import dagger.BindsInstance
import dagger.Component
import ua.fuel.di.viewmodel.ViewModelModule
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class, ViewModelModule::class])
interface AppComponent {
    fun inject(questionaryFragment: QuestionaryFragment)
    fun inject(loginFragment: LoginFragment)

    @Component.Builder
    interface AppComponentBuilder {
        @BindsInstance
        fun getContext(context: Context): AppComponentBuilder
        fun buildAppComponent(): AppComponent
    }
}