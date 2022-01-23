package dev.murod.noteapp.domain.impl

import dev.murod.noteapp.data.repository.NoteRepository
import dev.murod.noteapp.data.source.local.entity.Note
import dev.murod.noteapp.domain.HomeUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HomeUseCaseImpl @Inject constructor(
    private val noteRepository: NoteRepository
) : HomeUseCase {
    override fun getNotes(): Flow<List<Note>> {
        return noteRepository.getNotes()
    }

    override fun getNoteById(noteId: String): Note? {
        return noteRepository.getNoteById(noteId)
    }

    override suspend fun addNote(note: Note) {
        noteRepository.addNote(note)
    }

    override suspend fun delete(note: Note) {
        noteRepository.delete(note)
    }

    override suspend fun deleteAll(notes: List<Note>) {
        noteRepository.deleteAll(notes)
    }

    override suspend fun deleteAll() {
        noteRepository.clear()
    }
}