package com.example.cn333as5.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PhoneDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "phone") val phone: String,
    @ColumnInfo(name = "color_id") val colorId: Long,
    @ColumnInfo(name = "tag") val tag: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean
) {
    companion object {
        val DEFAULT_NOTES = listOf(
            PhoneDbModel(1, "Hades Grey", "781-521-8785", 1,2, false),
            PhoneDbModel(2, "Emalee Noyer", "650-451-8466", 2,2, false),
            PhoneDbModel(3, "Klaus Abbasi", "731-961-0163", 3,2, false),
            PhoneDbModel(4, "Felix Lyon", "724-882-0792", 4,2, false),
            PhoneDbModel(5, "Areg Jusić", "430-988-4678", 5,3, false),
            PhoneDbModel(6, "Ümran Ayers", "704-579-8639", 6,3, false),
            PhoneDbModel(7, "Jarmila Medved", "239-279-7753", 7,3, false),
            PhoneDbModel(8, "Kama Michalak", "678-390-5104", 8,3, false),
            PhoneDbModel(9, "Mylène Kadeř", "757-619-9808", 9,4, false),
            PhoneDbModel(10, "Eudoxia Nieves", "763-225-2643", 10,4, false),
            PhoneDbModel(11, "Carola Parma", "530-390-7168", 11,4, false),
            PhoneDbModel(12, "Archimedes Buchvarov", "207-213-8613", 12,4, false)
        )
    }
}
