package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginAlready extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.already_login);

        Button back_button = (Button) findViewById(R.id.button2);

        EditText usernameE = findViewById(R.id.u);
        EditText passE = findViewById(R.id.p);
        EditText gtinhE = findViewById(R.id.g);
        EditText ngsinhE = findViewById(R.id.d);

        Intent intent = getIntent();
        usernameE.setText(intent.getStringExtra("u"));
        passE.setText(intent.getStringExtra("p"));
        gtinhE.setText(intent.getStringExtra("g"));
        ngsinhE.setText(intent.getStringExtra("d"));

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}