package com.utkarsh.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText firstEdit;
    EditText secondEdit;
    Button saveBtn;
    Button startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstEdit = findViewById(R.id.first_edit);
        secondEdit = findViewById(R.id.second_edit);
        saveBtn = findViewById(R.id.save_btn);
        startBtn = findViewById(R.id.start_btn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstEdit.setVisibility(View.GONE);
                secondEdit.setVisibility(View.VISIBLE);
            }
        });

        String firstText = firstEdit.getText().toString();
        String secondText = secondEdit.getText().toString();

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });
    }
}
