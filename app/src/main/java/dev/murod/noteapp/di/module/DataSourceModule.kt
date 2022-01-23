package dev.murod.noteapp.di.module

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.murod.noteapp.data.repository.NoteRepository
import dev.murod.noteapp.data.repository.impl.NoteRepositoryImpl
import dev.murod.noteapp.data.source.NoteDataSource
import dev.murod.noteapp.data.source.local.LocalNoteDataSource
import dev.murod.noteapp.data.source.remote.RemoteNoteDataSource
import dev.murod.noteapp.di.qualifiers.LocalDataSource
import dev.murod.noteapp.di.qualifiers.RemoteDataSource
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {

    @Singleton
    @Binds
    @RemoteDataSource
    fun bindRemoteDataSource(impl: RemoteNoteDataSource): NoteDataSource

    @Singleton
    @Binds
    @LocalDataSource
    fun bindNoteDataSource(impl: LocalNoteDataSource): NoteDataSource

    @Singleton
    @Binds
    fun bindNoteRepository(impl: NoteRepositoryImpl): NoteRepository
}