package dev.murod.noteapp.data.repository

import dev.murod.noteapp.data.source.local.entity.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    fun getNotes(): Flow<List<Note>>
    fun getNoteById(noteId:String):Note?
    suspend fun addNote(note: Note)
    suspend fun delete(note: Note)
    suspend fun updateNote(note: Note)
    suspend fun deleteAll(notes:List<Note>)
    suspend fun clear()
}