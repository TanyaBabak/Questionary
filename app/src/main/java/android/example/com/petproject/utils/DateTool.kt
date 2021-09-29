package android.example.com.petproject.utils

import java.util.*

fun Long.toDate() = Date(this)
fun Date.toLong() = this.time
class DateTool {


    companion object {
        val FULL_DATE = "dd.mm.yyyy"
    }
}