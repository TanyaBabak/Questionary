package android.example.com.petproject.data.sourse.db

import android.example.com.petproject.AppConst
import android.example.com.petproject.data.entities.AccountEntity
import android.example.com.petproject.domain.model.Converter
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [AccountEntity::class], version = AppConst.Database.DATABASE_VERSION)
@TypeConverters(Converter::class)
abstract class QuestionaryDatabase : RoomDatabase() {

    abstract fun accountDao(): AccountDao
}