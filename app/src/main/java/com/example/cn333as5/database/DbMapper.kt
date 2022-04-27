package com.example.cn333as5.database
import com.example.cn333as5.domain.model.ColorModel
import com.example.cn333as5.domain.model.NEW_NOTE_ID
import com.example.cn333as5.domain.model.PhoneModel
import com.example.cn333as5.domain.model.TagModel

class DbMapper {
    // Create list of NoteModels by pairing each note with a color
    fun mapPhones(
        phoneDbModels: List<PhoneDbModel>,
        colorDbModels: Map<Long, ColorDbModel>,
        tagDbModels: Map<Long, TagDbModel>
    ): List<PhoneModel> = phoneDbModels.map {
        val colorDbModel = colorDbModels[it.colorId]
            ?: throw RuntimeException("Color for colorId: ${it.colorId} was not found. Make sure that all colors are passed to this method")
        val tagDbModel = tagDbModels[it.tag]
            ?: throw RuntimeException(" ${it.tag} was not found.")

        mapPhone(it, colorDbModel, tagDbModel)
    }

    // convert PhoneDbModel to PhoneModel
    fun mapPhone(phoneDbModel: PhoneDbModel, colorDbModel: ColorDbModel, tagDbModel: TagDbModel): PhoneModel {
        val color = mapColor(colorDbModel)
        val tag = mapTag(tagDbModel)

        return with(phoneDbModel) { PhoneModel(id,name ,phone, color,tag) }
    }

    // convert list of ColorDdModels to list of ColorModels
    fun mapColors(colorDbModels: List<ColorDbModel>): List<ColorModel> =
        colorDbModels.map { mapColor(it) }

    // convert ColorDbModel to ColorModel
    fun mapColor(colorDbModel: ColorDbModel): ColorModel =
        with(colorDbModel) { ColorModel(id, name, hex) }

    // convert list of ColorDdModels to list of ColorModels
    fun mapTags(tagDbModels: List<TagDbModel>): List<TagModel> =
        tagDbModels.map { mapTag(it) }

    // convert ColorDbModel to ColorModel
    fun mapTag(tagDbModel: TagDbModel):TagModel =
        with(tagDbModel) { TagModel(id, nameTag) }




    // convert NoteModel back to NoteDbModel
    fun mapDbPhone(phones: PhoneModel): PhoneDbModel =
        with(phones) {
            if (id == NEW_NOTE_ID)
                PhoneDbModel(
                    name = name,
                    phone = phone,
                    colorId = color.id,
                    tag = tag.id,
                    isInTrash = false
                )
            else
                PhoneDbModel(id, name, phone,  color.id, tag.id, false)
        }
}