package com.example.nivedhaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class loginpage extends AppCompatActivity {
    Button login btn;
    Textview NEWREGISTER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login btn=findViewById(R.id.login btn);
        NEWREGISTER=findviewById(R.id.NEWREGISTER);
        login btn.setOnclicklistener(new View().OnClickListener() {
            @Override
            pubilc void onClick(voiew view) {
                Intent intent = new Intent ( packageContext Login.this,MainActivity.class);
                startActivity(intent);
            }

        }
    }
}