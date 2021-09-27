package android.example.com.petproject.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AccountEntity(@PrimaryKey val id: Int, val name: String, val info: String)
