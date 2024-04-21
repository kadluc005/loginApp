package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.username = (TextView) findViewById(R.id.txt_user);
    }

    public void login(View view){
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        intent.putExtra("username",this.username.getText().toString());
        startActivity(intent);
    }
}