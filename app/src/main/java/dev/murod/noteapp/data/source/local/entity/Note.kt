package dev.murod.noteapp.data.source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName="note_entity")
data class Note(
    @PrimaryKey val id: String = UUID.randomUUID().toString(),
    var title: String = "",
    var content: String = ""
)