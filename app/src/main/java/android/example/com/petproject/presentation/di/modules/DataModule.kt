package android.example.com.petproject.presentation.di.modules

import android.content.Context
import android.example.com.petproject.AppConst
import android.example.com.petproject.data.db.QuestionaryDatabase
import androidx.room.Room
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideDataBase(context: Context): QuestionaryDatabase = Room.databaseBuilder(
        context,
        QuestionaryDatabase::class.java,
        AppConst.Database.DB_NAME
    )
        .fallbackToDestructiveMigration()
        .build()
}