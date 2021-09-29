package android.example.com.petproject.domain.model

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converter {

    @TypeConverter
    fun fromList(list: List<String>?): String? {
        if (list == null) {
            return null
        }
        val gson = Gson()
        val typeToken = object : TypeToken<List<String>>() {}.type
        return gson.toJson(list, typeToken)
    }

    @TypeConverter
    fun fromString(hobbies: String?): List<String>? {
        if (hobbies == null) {
            return null
        }
        val gson = Gson()
        val typeToken = object : TypeToken<List<String>>() {}.type
        return gson.fromJson(hobbies, typeToken)
    }
}