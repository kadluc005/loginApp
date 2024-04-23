package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView username;
    TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.username = (TextView) findViewById(R.id.txt_user);
        this.password = (TextView) findViewById(R.id.txt_password);
    }

    public void login(View view){
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        intent.putExtra("username",this.username.getText().toString());
        if("".equals(this.username.getText().toString())||"".equals(this.password.getText().toString())){
            Toast.makeText(MainActivity.this, "veulliez rempiler tout les champs", Toast.LENGTH_SHORT).show();
        }
        if("0000".equals(password.getText().toString())){
            Toast.makeText(MainActivity.this, "username, mot de passe vérifiés", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }else{
            Toast.makeText(MainActivity.this, "Mot de passe erroné", Toast.LENGTH_SHORT).show();
        }
    }
}

