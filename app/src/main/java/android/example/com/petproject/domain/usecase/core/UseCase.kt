package android.example.com.petproject.domain.usecase.core

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class UseCase {

    protected var disposable: Disposable? = null
    protected val compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun disposeLast() {
        disposable?.let {
            if (!it.isDisposed) {
                it.dispose()
            }
        }
    }

    fun dispose() {
        compositeDisposable.clear()
    }
}