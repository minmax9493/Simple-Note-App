package dev.murod.noteapp.domain.impl

import dev.murod.noteapp.data.repository.NoteRepository
import dev.murod.noteapp.domain.DetailsUseCase
import javax.inject.Inject

class DetailsUseCaseImpl @Inject constructor(private val noteRepository: NoteRepository):DetailsUseCase {
}