package com.utkarsh.tictactoe;

import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    TextView firstEdit;
    TextView secondEdit;
    TextView thirdEdit;
    TextView fourthEdit;
    TextView fifthEdit;
    TextView sixthEdit;
    TextView seventhEdit;
    TextView eighthEdit;
    TextView ninthEdit;


    String firstSpot = "A";
    String secondSpot = "A";
    String thirdSpot = "A";
    String fourthSpot = "A";
    String fifthSpot = "A";
    String sixthSpot = "A";
    String seventhSpot = "A";
    String eigthSpot = "A";
    String ninthSpot = "A";
//
    String chance = "X";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        firstEdit = findViewById(R.id.first_spot);
        firstEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstEdit.setText(chance);
                change(chance);
            }
        });

        secondEdit = findViewById(R.id.second_spot);
        secondEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondEdit.setText(chance);
                change(chance);
                check();
            }
        });
        thirdEdit = findViewById(R.id.third_spot);
        thirdEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirdEdit.setText(chance);
                change(chance);
            }
        });
        fourthEdit = findViewById(R.id.fourth_spot);
        fourthEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourthEdit.setText(chance);
                change(chance);
            }
        });
        fifthEdit = findViewById(R.id.fifth_spot);
        fifthEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fifthEdit.setText(chance);
                change(chance);
            }
        });
        sixthEdit = findViewById(R.id.sixth_spot);
        sixthEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixthEdit.setText(chance);
                change(chance);
            }
        });
        seventhEdit = findViewById(R.id.seventh_spot);
        seventhEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seventhEdit.setText(chance);
                change(chance);
            }
        });
        eighthEdit = findViewById(R.id.eighth_spot);
        eighthEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eighthEdit.setText(chance);
                change(chance);
            }
        });
        ninthEdit = findViewById(R.id.ninth_spot);
        ninthEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ninthEdit.setText(chance);
                change(chance);
            }
        });

    }

    private void change(String nextChance) {
        if (nextChance.equals("X")) {
            chance = "O";
        }
        else chance = "X";
    }

    private void check() {
        String firstSpot = firstEdit.getText().toString();
        String secondSpot = secondEdit.getText().toString();
        String thirdSpot = thirdEdit.getText().toString();
        String fourthSpot = fourthEdit.getText().toString();
        String fifthSpot = fifthEdit.getText().toString();
        String sixthSpot = sixthEdit.getText().toString();
        String seventhSpot = seventhEdit.getText().toString();
        String eigthSpot = eighthEdit.getText().toString();
        String ninthSpot = ninthEdit.getText().toString();

        if (firstSpot.equals("X") && secondSpot.equals("X") && thirdSpot.equals("X")
                || firstSpot.equals("O") && secondSpot.equals("O") && thirdSpot.equals("O")) {
            
        }
        else if(firstSpot.equals("X") && fourthSpot.equals("X") && seventhSpot.equals("X")
                || firstSpot.equals("O") && fourthSpot.equals("O") && seventhSpot.equals("O")) {

        }
        else if (thirdSpot.equals("X") && sixthSpot.equals("X") && ninthSpot.equals("X")
                || thirdSpot.equals("O") && sixthSpot.equals("O") && ninthSpot.equals("O")) {

        }
        else if (seventhSpot.equals("X") && eigthSpot.equals("X") && ninthSpot.equals("X")
                || seventhSpot.equals("O") && eigthSpot.equals("O") && ninthSpot.equals("O")) {

        }
        else if (firstSpot.equals("X") && fifthSpot.equals("X") && ninthSpot.equals("X")
                || firstSpot.equals("O") && fifthSpot.equals("O") && ninthSpot.equals("O")) {

        }
        else if (seventhSpot.equals("X") && fifthSpot.equals("X") && thirdSpot.equals("X")
                || seventhSpot.equals("O") && fifthSpot.equals("O") && thirdSpot.equals("O")) {

        }
        else if (fourthSpot.equals("X") && fifthSpot.equals("X") && sixthSpot.equals("X")
                || fourthSpot.equals("O") && fifthSpot.equals("O") && sixthSpot.equals("O")) {

        }
        else if (secondSpot.equals("X") && fifthSpot.equals("X") && eigthSpot.equals("X")
                || secondSpot.equals("O") && fifthSpot.equals("O") && eigthSpot.equals("O")) {

        }
    }
}
