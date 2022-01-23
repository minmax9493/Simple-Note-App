package dev.murod.noteapp.di.module

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import dev.murod.noteapp.data.source.local.dao.NoteDao
import dev.murod.noteapp.data.source.local.db.NoteDatabase

@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [DataBaseModule::class]
)
@Module
class DataBaseModuleTest {

    @Provides
    fun provideNoteDatabase(@ApplicationContext context: Context): NoteDatabase = Room
        .inMemoryDatabaseBuilder(context, NoteDatabase::class.java)
        .allowMainThreadQueries()// in Unit test try to work on the same thread, since multithreading manipulates each other
        .build()

    @Provides
    fun provideNoteDao(database: NoteDatabase): NoteDao = database.noteDao()

}