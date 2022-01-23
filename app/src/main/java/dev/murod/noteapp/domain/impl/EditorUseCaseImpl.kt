package dev.murod.noteapp.domain.impl

import dev.murod.noteapp.data.repository.NoteRepository
import dev.murod.noteapp.domain.EditorUseCase
import javax.inject.Inject

class EditorUseCaseImpl @Inject constructor(private val noteRepository: NoteRepository):EditorUseCase {

}