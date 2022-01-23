package dev.murod.noteapp.domain

import dev.murod.noteapp.data.source.local.entity.Note
import kotlinx.coroutines.flow.Flow

interface HomeUseCase {
    fun getNotes():Flow<List<Note>>
    fun getNoteById(noteId:String):Note?
    suspend fun addNote(note:Note)
    suspend fun delete(note:Note)
    suspend fun deleteAll(notes:List<Note>)
    suspend fun deleteAll()
}