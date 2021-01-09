package com.example.synonyms.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityManager;
import android.os.Bundle;
import android.view.View;

import com.example.synonyms.R;
import com.example.synonyms.RecyclerAdapter;
import com.example.synonyms.ui.fragments.SavedSynonymsFragment;
import com.example.synonyms.ui.fragments.SearchFragment;

import static androidx.recyclerview.widget.RecyclerView.*;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    SearchFragment searchFragment;
    SavedSynonymsFragment savedSynonymsFragment;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = findViewById(R.id.toolbar);



    }

}