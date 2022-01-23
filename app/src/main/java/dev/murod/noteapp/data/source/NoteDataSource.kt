package dev.murod.noteapp.data.source

import dev.murod.noteapp.data.source.local.entity.Note
import kotlinx.coroutines.flow.Flow

interface NoteDataSource {
    fun getNotes(): Flow<List<Note>>
    fun getNoteById(noteId: String): Note?
    suspend fun deleteNote(note: Note)
    suspend fun deleteAllNotes(notes:List<Note>)
    suspend fun deleteAllNotes()
    suspend fun addNote(note: Note)
    suspend fun updateNote(note: Note)
    suspend fun refreshNotes()
}