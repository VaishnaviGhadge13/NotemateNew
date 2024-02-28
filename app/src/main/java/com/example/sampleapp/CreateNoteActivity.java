package com.example.sampleapp;

import static com.example.sampleapp.R.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.DragStartHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.firestore.Query;


public class CreateNoteActivity extends AppCompatActivity {

    FloatingActionButton addNoteBtn;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_create_note);

        addNoteBtn=findViewById(id.add_note_btn);


        addNoteBtn.setOnClickListener((v) -> startActivity(new Intent(CreateNoteActivity.this, CreateNextActivity.class)));

    }

}
