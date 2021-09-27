package android.example.com.petproject.presentation

import android.app.Application
import android.example.com.petproject.presentation.di.Injector


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Injector.initInjection(this)
    }
}