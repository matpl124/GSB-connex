package com.example.gsb;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();

        String mail = intent.getStringExtra("mail");
        String surname = intent.getStringExtra("surname");
        String name = intent.getStringExtra("name");
        String statut = intent.getStringExtra("statut");
        TextView textView = findViewById(R.id.idMail);
        TextView textView1 = findViewById(R.id.idSurname);
        TextView textView2 = findViewById(R.id.idS);
        TextView textView3 = findViewById(R.id.idName);
        textView.setText(mail);
        textView1.setText(surname);
        textView2.setText(statut);
        textView3.setText(name);





        //textView3.setText(mail);

    }
}