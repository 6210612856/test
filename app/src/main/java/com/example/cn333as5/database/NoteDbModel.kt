package com.example.cn333as5.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "color_id") val colorId: Long,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean
) {
    companion object {
        val DEFAULT_NOTES = listOf(
            NoteDbModel(1, "RW Meeting", "Prepare sample project",  1, 2,false),
            NoteDbModel(2, "Bills", "Pay by tomorrow",  2, 2,false),
            NoteDbModel(3, "Pancake recipe", "Milk, eggs, salt, flour...",  3, 2,false),
            NoteDbModel(4, "Workout", "Running, push ups, pull ups, squats...", 4,2, false),
            NoteDbModel(5, "Title 5", "Content 5",  5, 3,false),
            NoteDbModel(6, "Title 6", "Content 6", 6, 3,false),
            NoteDbModel(7, "Title 7", "Content 7", 7, 3,false),
            NoteDbModel(8, "Title 8", "Content 8",  8, 3,false),
            NoteDbModel(9, "Title 9", "Content 9",  9, 4,false),
            NoteDbModel(10, "Title 10", "Content 10",  10, 4,false),
            NoteDbModel(11, "Title 11", "Content 11",  11, 4,false),
            NoteDbModel(12, "Title 12", "Content 12",  12, 4,false)
        )
    }
}
