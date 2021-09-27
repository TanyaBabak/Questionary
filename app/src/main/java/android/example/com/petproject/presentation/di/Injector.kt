 package android.example.com.petproject.presentation.di

import android.content.Context
import android.example.com.petproject.presentation.di.components.AppComponent
import android.example.com.petproject.presentation.di.components.DaggerAppComponent


 object Injector {
    var applicationComponent: AppComponent? = null
        private set

    fun initInjection(context: Context) {
        if (applicationComponent == null) {
            applicationComponent =
                DaggerAppComponent
                    .builder()
                    .getContext(context).buildAppComponent()
        }
    }
}