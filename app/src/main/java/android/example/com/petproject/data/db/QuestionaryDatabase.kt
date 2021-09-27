package android.example.com.petproject.data.db

import android.example.com.petproject.AppConst
import android.example.com.petproject.data.entities.AccountEntity
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [AccountEntity::class], version = AppConst.Database.DATABASE_VERSION)
abstract class QuestionaryDatabase : RoomDatabase() {

    abstract fun accountDao(): AccountDao
}