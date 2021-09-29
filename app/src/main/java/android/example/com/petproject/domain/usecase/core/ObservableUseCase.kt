package android.example.com.petproject.domain.usecase.core

import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

abstract class ObservableUseCase<T, in Param> : UseCase() {

    protected abstract fun buildUseCase(param: Param): Single<T>
    operator fun invoke(
        param: Param,
        next: (T) -> Unit,
        error: (Throwable) -> Unit
    ) {
        disposable = buildUseCase(param)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(next, error)
        disposable?.let {
            compositeDisposable.add(it)
        }
    }

}