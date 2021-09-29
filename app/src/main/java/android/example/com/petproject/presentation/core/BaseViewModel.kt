package android.example.com.petproject.presentation.core

import android.example.com.petproject.exception.Failure
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {
    val failureLiveData: MutableLiveData<Failure> = MutableLiveData()

    fun addFailure(failure: Failure) {
        failureLiveData.value = failure
    }
}