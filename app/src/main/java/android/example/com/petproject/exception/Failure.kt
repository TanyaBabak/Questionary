package android.example.com.petproject.exception

import android.database.sqlite.SQLiteException

sealed class Failure {
    class DataBaseException(ex: SQLiteException)
    class InnerException(ex: Throwable)
    class NetworkConnection()
}
