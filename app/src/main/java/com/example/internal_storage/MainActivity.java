package com.example.internal_storage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.FileNotFoundException;

public class MainActivity extends AppCompatActivity {

    EditText name , password;
    Button save_button , next_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name_edt);
        password = findViewById(R.id.pass_edt);

        save_button = findViewById(R.id.save_btn);
        next_button = findViewById(R.id.next_btn);
    }

    public void save_btn(View view) {
         String u_name = name.getText().toString();
         String pass_word = password.getText().toString();
        try {
            openFileOutput("yash_tank.txt",MODE_PRIVATE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void next_btn(View view) {

    }
}
