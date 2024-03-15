package com.example.gsb;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText mailText;
    private EditText passwordText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        mailText = (EditText)findViewById(R.id.mailText);
        passwordText = (EditText)findViewById(R.id.passwordText);
    }

    public void connexion(View view) {
        String[] id = {mailText.getText().toString(),passwordText.getText().toString()};
        new Async(this).execute(id);
    }
}