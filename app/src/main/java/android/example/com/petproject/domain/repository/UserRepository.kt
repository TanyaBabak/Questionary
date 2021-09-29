package android.example.com.petproject.domain.repository

import android.example.com.petproject.domain.model.Account
import io.reactivex.Single

interface UserRepository {
    fun addUser(account: Account): Single<Long>
}