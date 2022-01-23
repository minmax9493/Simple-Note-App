package dev.murod.noteapp.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.murod.noteapp.data.source.local.dao.NoteDao
import dev.murod.noteapp.data.source.local.db.NoteDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule {

    @Provides
    @Singleton
    fun getDatabase(@ApplicationContext context: Context) = NoteDatabase.getDatabase(context)

    @Provides
    @Singleton
    fun provideNoteDao(noteDatabase: NoteDatabase): NoteDao = noteDatabase.noteDao()
}