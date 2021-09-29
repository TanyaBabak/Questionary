package android.example.com.petproject.data.entities

import android.example.com.petproject.domain.model.Account
import android.example.com.petproject.utils.toLong
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Account")
data class AccountEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val surName: String?,
    val date: String?,
    val address: String?,
    val info: String?,
    val hobbies: List<String>?
) {
    companion object {
        fun convertFromAccount(account: Account):AccountEntity {
            val accountEntity = AccountEntity(
                account.id,
                account.name,
                account.surName,
                account.date,
                account.address,
                account.info,
                account.hobbies
            )
            return accountEntity
        }
    }
}
