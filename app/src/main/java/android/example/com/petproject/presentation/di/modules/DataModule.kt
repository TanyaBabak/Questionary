package android.example.com.petproject.presentation.di.modules

import android.content.Context
import android.example.com.petproject.AppConst
import android.example.com.petproject.data.repository.UserRepositoryImp
import android.example.com.petproject.data.sourse.db.QuestionaryDatabase
import android.example.com.petproject.domain.repository.UserRepository
import androidx.room.Room
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {

    @Singleton
    @Provides
    fun provideDataBase(context: Context): QuestionaryDatabase = Room.databaseBuilder(
        context,
        QuestionaryDatabase::class.java,
        AppConst.Database.DB_NAME
    )
        .fallbackToDestructiveMigration()
        .build()

    @Singleton
    @Provides
    fun provideUserRepository(database: QuestionaryDatabase):UserRepository = UserRepositoryImp(database)
}