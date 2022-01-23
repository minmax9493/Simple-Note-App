package dev.murod.noteapp.data.source.local

import dev.murod.noteapp.data.source.NoteDataSource
import dev.murod.noteapp.data.source.local.dao.NoteDao
import dev.murod.noteapp.data.source.local.entity.Note
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalNoteDataSource @Inject constructor(private val noteDao: NoteDao) : NoteDataSource {
    override fun getNotes(): Flow<List<Note>> {
        return noteDao.getNotesFlowable()
    }

    override fun getNoteById(noteId: String): Note? {
        return noteDao.getNoteById(noteId)
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.delete(note)
    }

    override suspend fun deleteAllNotes(notes: List<Note>) {
        noteDao.deleteAll(notes)
    }

    override suspend fun deleteAllNotes() {
        noteDao.clear()
    }

    override suspend fun addNote(note: Note) {
        noteDao.insert(note)
    }

    override suspend fun updateNote(note: Note) {
        noteDao.update(note)
    }

    override suspend fun refreshNotes() {
        TODO("Not yet implemented")
    }
}