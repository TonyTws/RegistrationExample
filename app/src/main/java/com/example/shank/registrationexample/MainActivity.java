package com.example.shank.registrationexample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edName,edEmali,edPass;
    Button regButton,allrButton;
    SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edName = findViewById(R.id.userId);
        edEmali =  findViewById(R.id.emailId);
        edPass = findViewById(R.id.passId);
        regButton = findViewById(R.id.RegId);
        allrButton = findViewById(R.id.allId);

        database = openOrCreateDatabase("projectdata.db", Context.MODE_PRIVATE,null);
        String sql = "create table if not exists user_dtls(name varchar,username varchar,pass varchar)";
        database.execSQL(sql);

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        allrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
