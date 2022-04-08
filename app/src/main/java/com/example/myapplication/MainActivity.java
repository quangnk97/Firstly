package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login_button = (Button) findViewById(R.id.button);
        username = (EditText) findViewById(R.id.user1);
        password = (EditText) findViewById(R.id.pass1);

        account[] Array = new account[5];
        Set5_users(Array);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userInput = username.getText().toString();
                String passInput = password.getText().toString();
                Boolean isSucceeded = false;

                int i;
                for(i = 0; i< Array.length; i++){
                    if (userInput.compareTo(Array[i].getNameOut()) == 0 &&
                            passInput.compareTo(Array[i].getPassOut()) == 0){
                        isSucceeded = true;
                        break;
                    }
                }

                String Message = isSucceeded ? "Login is successfully" : "Login is failed";

                Toast.makeText(MainActivity.this, Message, Toast.LENGTH_LONG).show();
                if (isSucceeded){
                    Intent next = new Intent(getApplicationContext(), LoginAlready.class);

                    next.putExtra("u", Array[i].getNameOut());
                    next.putExtra("p", Array[i].getPassOut());
                    next.putExtra("g", Array[i].getGtinh());
                    next.putExtra("d", Array[i].getNgsinh());

                    startActivity(next);
                }
            }
        });
    }
    void Set5_users(account[] Array){
        Array[0] = new account("acc1", "123", "Nu", "01-01-2001");
        Array[1] = new account("acc2", "456", "Nam", "02-02-2002");
        Array[2] = new account("acc3", "789", "Nu", "03-03-2003");
        Array[3] = new account("acc4", "135", "Nam", "04-04-2004");
        Array[4] = new account("acc5", "246", "Nu", "05-05-2005");
    }
}