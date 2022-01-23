package dev.murod.noteapp.data.source.local.dao

import androidx.room.Dao
import androidx.room.Query
import dev.murod.noteapp.data.source.local.entity.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao : BaseDao<Note> {
    @Query("select * from note_entity")
    fun getNotesFlowable(): Flow<List<Note>>

    @Query("select * from note_entity")
    fun getNotes(): List<Note>

    @Query("select * from note_entity where id = :noteId")
    fun getNoteById(noteId: String): Note?

    @Query("delete from note_entity")
    suspend fun clear()
}