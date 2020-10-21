package com.codingwithmitch.notes.persistence;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.codingwithmitch.notes.models.Note;

@Database(entities = {Note.class}, version = 1)
public abstract class NoteDatabase extends RoomDatabase {
}
