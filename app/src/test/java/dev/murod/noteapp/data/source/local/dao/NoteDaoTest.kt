package dev.murod.noteapp.data.source.local.dao

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import dev.murod.noteapp.data.source.local.db.NoteDatabase
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import javax.inject.Inject

@HiltAndroidTest
@RunWith(RobolectricTestRunner::class)
@ExperimentalCoroutinesApi
@Config(application = HiltTestApplication::class, sdk = [29])
class NoteDaoTest {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Inject
    lateinit var noteDatabase: NoteDatabase

    lateinit var noteDao: NoteDao

    @Before
    fun setup() {
        hiltRule.inject()
        noteDao = noteDatabase.noteDao()
    }

    @After
    fun tearDown() {
        noteDatabase.close()
    }
}