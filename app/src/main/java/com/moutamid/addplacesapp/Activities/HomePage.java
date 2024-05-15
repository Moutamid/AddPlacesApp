package com.moutamid.addplacesapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.firestore.FirebaseFirestore;
import com.moutamid.addplacesapp.Helper.Config;
import com.moutamid.addplacesapp.R;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
FirebaseFirestore db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Button img = findViewById(R.id.btnAdd);
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