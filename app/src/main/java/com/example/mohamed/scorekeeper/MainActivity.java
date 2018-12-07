package com.example.mohamed.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView_teamA, textView_teamB;
    Button button_plus_1_team_A, button_plus_1_team_B, button_plus_2_team_A, button_plus_2_team_B, button_plus_3_team_A, button_plus_3_team_B,
            button_plus_6_team_A, button_plus_6_team_B, button_reset;
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initialize views
        textView_teamA = findViewById(R.id.tv_score_teamA);
        textView_teamB = findViewById(R.id.tv_score_teamB);

        button_plus_1_team_A = findViewById(R.id.btn_plus_one_teamA);
        button_plus_1_team_B = findViewById(R.id.btn_plus_one_teamB);
        button_plus_2_team_A = findViewById(R.id.btn_plus_two_teamA);
        button_plus_2_team_B = findViewById(R.id.btn_plus_two_teamB);
        button_plus_3_team_A = findViewById(R.id.btn_plus_three_teamA);
        button_plus_3_team_B = findViewById(R.id.btn_plus_three_teamB);
        button_plus_6_team_A = findViewById(R.id.btn_plus_six_teamA);
        button_plus_6_team_B = findViewById(R.id.btn_plus_six_teamB);

        button_reset = findViewById(R.id.btn_reset);

        button_plus_1_team_A.setOnClickListener(this);
        button_plus_2_team_A.setOnClickListener(this);
        button_plus_3_team_A.setOnClickListener(this);
        button_plus_6_team_A.setOnClickListener(this);

        button_plus_1_team_B.setOnClickListener(this);
        button_plus_2_team_B.setOnClickListener(this);
        button_plus_3_team_B.setOnClickListener(this);
        button_plus_6_team_B.setOnClickListener(this);

        button_reset.setOnClickListener(this);
        displayScore();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_plus_one_teamA)
            scoreA += 1;
        else if (v.getId() == R.id.btn_plus_two_teamA)
            scoreA += 2;
        else if (v.getId() == R.id.btn_plus_three_teamA)
            scoreA += 3;
        else if (v.getId() == R.id.btn_plus_six_teamA)
            scoreA += 6;
        else if (v.getId() == R.id.btn_plus_one_teamB)
            scoreB += 1;
        else if (v.getId() == R.id.btn_plus_two_teamB)
            scoreB += 2;
        else if (v.getId() == R.id.btn_plus_three_teamB)
            scoreB += 3;
        else if (v.getId() == R.id.btn_plus_six_teamB)
            scoreB += 6;
        else {
            scoreA = 0;
            scoreB = 0;
        }
        displayScore();
    }

    private void displayScore() {
        textView_teamA.setText(Integer.toString(scoreA));
        textView_teamB.setText(Integer.toString(scoreB));
    }
}
