package com.codingwithmitch.notes.persistence;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.codingwithmitch.notes.models.Note;

import java.util.List;

public class NoteRepository {

    private  NoteDatabase mNoteDatabase;

    public NoteRepository(Context context) {
        mNoteDatabase = NoteDatabase.getInstance(context);
    }

    public void insertNoteTask(Note note){

    }

    public void updateNote(Note note){

    }

    public LiveData<List<Note>> retrieveNoteTask(){
        return mNoteDatabase.getNoteDao().getNotes();
    }

    public void deleteNote(Note note){

    }
}
