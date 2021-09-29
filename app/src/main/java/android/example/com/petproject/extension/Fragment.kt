package android.example.com.petproject.extension

import androidx.fragment.app.Fragment
import androidx.lifecycle.*

inline fun <reified T : ViewModel> Fragment.viewModel(
    viewModelProvider: ViewModelProvider.Factory,
    observer: T.() -> Unit
): T {
    val viewModel = ViewModelProvider(this, viewModelProvider).get(T::class.java)
    viewModel.observer()
    return viewModel
}

fun <T : Any> LifecycleOwner.observe(
    liveData: LiveData<T>,
    body: (T) -> (Unit)
) {
    liveData.observe(this, Observer(body))
}