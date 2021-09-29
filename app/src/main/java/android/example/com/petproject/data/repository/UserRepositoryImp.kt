package android.example.com.petproject.data.repository

import android.example.com.petproject.data.entities.AccountEntity
import android.example.com.petproject.data.sourse.db.QuestionaryDatabase
import android.example.com.petproject.domain.model.Account
import android.example.com.petproject.domain.repository.UserRepository
import io.reactivex.Single

class UserRepositoryImp constructor(private val questionaryDatabase: QuestionaryDatabase) :
    UserRepository {
    override fun addUser(account: Account): Single<Long> {
        return questionaryDatabase.accountDao()
            .insertUser(AccountEntity.convertFromAccount(account))
    }
}