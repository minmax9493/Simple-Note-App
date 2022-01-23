package dev.murod.noteapp.data.source.local.dao

import androidx.room.*

interface BaseDao<T> {
    /**
     * Update an object from the database.
     *
     * @param data the object to be updated
     */
    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(data: T):Int

    /**
     * Update an array of objects from the database.
     *
     * @param data the object to be updated
     */
    @Update
    suspend fun updateAll(data: List<T>):Int

    /**
     * Delete an object from the database
     *
     * @param data the object to be deleted
     */
    @Delete
    suspend fun delete(data: T): Int

    /**
     * Delete an array of objects from the database
     *
     * @param data the object to be deleted
     */
    @Delete
    suspend fun deleteAll(data: List<T>): Int

    /**
     * Insert an object in the database.
     *
     * @param data the object to be inserted.
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(data: T): Long

    /**
     * Insert an array of objects in the database.
     *
     * @param data the objects to be inserted.
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(data: List<T>)
}