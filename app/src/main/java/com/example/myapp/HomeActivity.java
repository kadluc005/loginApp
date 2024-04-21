package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String message = "Bonjour "+username+"👋";
        TextView welcomeMessage = findViewById(R.id.username_txt);
        welcomeMessage.setText(message);
    }
    public void back(View view){
        startActivity(new Intent(HomeActivity.this, MainActivity.class));
    }
}