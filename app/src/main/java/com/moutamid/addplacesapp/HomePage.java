package com.moutamid.addplacesapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;
import com.moutamid.addplacesapp.Helper.Config;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
MyAdapter myAdapter;
FirebaseFirestore db;
ArrayList<MapInfoModel> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        ImageView img = findViewById(R.id.addbtn);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        Config.checkApp(HomePage.this);


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this, AddPlacesActivity.class);
                startActivity(i);
            }
        });
    }

}