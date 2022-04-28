package com.example.cn333as5.database
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TagDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "nameTag") val nameTag: String
) {
    companion object {
        val DEFAULT_TAGS = listOf(
            TagDbModel(1, ""),
            TagDbModel(2, "HOME"),
            TagDbModel(3, "WORK"),
            TagDbModel(4, "MOBILE"),
        )
        val DEFAULT_TAG = DEFAULT_TAGS[0]
    }
}