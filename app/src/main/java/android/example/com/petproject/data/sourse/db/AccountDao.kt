package android.example.com.petproject.data.sourse.db

import android.example.com.petproject.data.entities.AccountEntity
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import io.reactivex.Single

@Dao
interface AccountDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(accountEntity: AccountEntity): Single<Long>
}