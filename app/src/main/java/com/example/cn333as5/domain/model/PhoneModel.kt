package com.example.cn333as5.domain.model

const val NEW_NOTE_ID = -1L

data class PhoneModel(
    val id: Long = NEW_NOTE_ID,
    val name: String = "",
    val phone: String = "",
    val color: ColorModel = ColorModel.DEFAULT,
    val tag : TagModel = TagModel.DEFAULT
)
