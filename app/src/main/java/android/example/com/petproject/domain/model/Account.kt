package android.example.com.petproject.domain.model

import android.example.com.petproject.data.entities.AccountEntity
import android.example.com.petproject.utils.toDate
import java.util.*

data class Account(
    val id: Int,
    val name: String,
    val surName: String?,
    val date: String?,
    val address: String?,
    val info: String?,
    val hobbies: List<String>?
) {
    fun convertFromAccountEntity(accountEntity: AccountEntity): Account {
        val account = Account(
            accountEntity.id,
            accountEntity.name,
            accountEntity.surName,
            accountEntity.date,
            accountEntity.address,
            accountEntity.info,
            accountEntity.hobbies
        )
        return account
    }
}
