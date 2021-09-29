package android.example.com.petproject.domain.usecase

import android.example.com.petproject.domain.model.Account
import android.example.com.petproject.domain.repository.UserRepository
import android.example.com.petproject.domain.usecase.core.ObservableUseCase
import io.reactivex.Single
import javax.inject.Inject

class AddAccountUseCase @Inject constructor(private val repository: UserRepository) :
    ObservableUseCase<Long, Account>() {
    override fun buildUseCase(data: Account): Single<Long> {
        return repository.addUser(data)
    }
}