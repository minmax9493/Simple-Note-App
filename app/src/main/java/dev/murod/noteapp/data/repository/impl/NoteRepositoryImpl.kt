package dev.murod.noteapp.data.repository.impl

import dev.murod.noteapp.data.repository.NoteRepository
import dev.murod.noteapp.data.source.NoteDataSource
import dev.murod.noteapp.data.source.local.entity.Note
import dev.murod.noteapp.di.qualifiers.LocalDataSource
import dev.murod.noteapp.di.qualifiers.RemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NoteRepositoryImpl @Inject constructor(
    @LocalDataSource private val localNoteDataSource: NoteDataSource,
    @RemoteDataSource private val remoteNoteDataSource: NoteDataSource
) : NoteRepository {
    override fun getNotes() = localNoteDataSource.getNotes()


    override fun getNoteById(noteId: String): Note? {
        return localNoteDataSource.getNoteById(noteId)
    }

    override suspend fun addNote(note: Note) {
        localNoteDataSource.addNote(note)
    }

    override suspend fun delete(note: Note) {
        localNoteDataSource.deleteNote(note)
    }

    override suspend fun updateNote(note: Note) {
        localNoteDataSource.updateNote(note)
    }

    override suspend fun deleteAll(notes: List<Note>) {
        localNoteDataSource.deleteAllNotes(notes)
    }

    override suspend fun clear() {
        localNoteDataSource.deleteAllNotes()
    }
}