package dev.murod.noteapp.data.source.remote

import dev.murod.noteapp.data.source.NoteDataSource
import dev.murod.noteapp.data.source.local.db.NoteDatabase
import dev.murod.noteapp.data.source.local.entity.Note
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteNoteDataSource @Inject constructor():NoteDataSource {
    override fun getNotes(): Flow<List<Note>> {
        TODO("Not yet implemented")
    }

    override fun getNoteById(noteId: String): Note? {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNote(note: Note) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAllNotes(notes: List<Note>) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAllNotes() {
        TODO("Not yet implemented")
    }

    override suspend fun addNote(note: Note) {
        TODO("Not yet implemented")
    }

    override suspend fun updateNote(note: Note) {
        TODO("Not yet implemented")
    }

    override suspend fun refreshNotes() {
        TODO("Not yet implemented")
    }
}