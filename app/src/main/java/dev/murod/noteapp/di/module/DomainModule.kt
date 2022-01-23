package dev.murod.noteapp.di.module

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.murod.noteapp.domain.DetailsUseCase
import dev.murod.noteapp.domain.EditorUseCase
import dev.murod.noteapp.domain.HomeUseCase
import dev.murod.noteapp.domain.impl.DetailsUseCaseImpl
import dev.murod.noteapp.domain.impl.EditorUseCaseImpl
import dev.murod.noteapp.domain.impl.HomeUseCaseImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DomainModule {

    @Singleton
    @Binds
    fun bindHomeUseCase(impl: HomeUseCaseImpl): HomeUseCase

    @Singleton
    @Binds
    fun bindEditorUseCase(impl: EditorUseCaseImpl): EditorUseCase

    @Singleton
    @Binds
    fun bindDetailsUseCase(impl: DetailsUseCaseImpl): DetailsUseCase

}