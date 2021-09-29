package android.example.com.petproject.exception

import android.database.sqlite.SQLiteException

sealed class Failure {
    class DataBaseException(ex: SQLiteException) : Failure()
    class InnerException(ex: Throwable) : Failure()
    class NetworkConnection() : Failure()
}
