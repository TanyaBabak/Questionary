package android.example.com.petproject.presentation.core

import android.example.com.petproject.exception.Failure
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

open class BaseViewModel : ViewModel() {
    val failureMutableLiveData: MutableLiveData<Failure> = MutableLiveData()
    val compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun addToDisposable(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    fun addFailure(failure: Failure) {
        failureMutableLiveData.value = failure
    }

    override fun onCleared() {
        compositeDisposable.dispose()
    }
}