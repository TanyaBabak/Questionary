package android.example.com.petproject.presentation.ui.login

import android.database.sqlite.SQLiteException
import android.example.com.petproject.domain.model.Account
import android.example.com.petproject.domain.usecase.AddAccountUseCase
import android.example.com.petproject.exception.Failure
import android.example.com.petproject.presentation.core.BaseViewModel
import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

class LoginViewModel @Inject constructor(private val addAccountUseCase: AddAccountUseCase) :
    BaseViewModel() {
    var idAccountLifeData: MutableLiveData<Long> = MutableLiveData()
        private set

    fun addAccount(account: Account) {
        addAccountUseCase(account, { idAccountLifeData::setValue }) {
            if (it is SQLiteException) {
                addFailure(Failure.DataBaseException(it))
            } else {
                addFailure(Failure.InnerException(it))
            }
        }
    }
}