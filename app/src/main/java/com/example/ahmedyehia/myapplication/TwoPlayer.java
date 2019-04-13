package com.example.ahmedyehia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TwoPlayer extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player);
        displayForteama(0);
        displayForteamb(0);
    }

    public void Resettwo(View view) {

        final Button buttonresettwo = (Button)findViewById(R.id.resettwo);
        buttonresettwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA=0;
                scoreTeamB=0;
                displayForteama(scoreTeamA);
                displayForteamb(scoreTeamB);
            }
        });
    }
    public void displayForteama(int score){

        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForteamb(int score){

        TextView scoreView = (TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }



    /**
     * Increase the score for Team B by 1
     **/
    public void addonetoteama(View view) {
        scoreTeamA = scoreTeamA+1;
        displayForteama(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 2
     **/
    public void addtwototeama(View view) {
        scoreTeamA = scoreTeamA+2;
        displayForteama(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 3
     **/
    public void addothreetoteama(View view) {
        scoreTeamA = scoreTeamA+3;
        displayForteama(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 4
     **/
    public void addfourtoteama(View view) {
        scoreTeamA = scoreTeamA+4;
        displayForteama(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 5
     **/
    public void addfivetoteama(View view) {

        scoreTeamA = scoreTeamA+5;
        displayForteama(scoreTeamA);
    }
    /**
     * Minus the score for Team B by 1
     **/
    public void minonetoteama(View view) {
        scoreTeamA = scoreTeamA-1;
        displayForteama(scoreTeamA);
    }
    /**
     * Minus the score for Team B by 2
     **/
    public void mintwototeama(View view) {
        scoreTeamA = scoreTeamA-2;
        displayForteama(scoreTeamA);
    }
    /**
     * Minus the score for Team B by 3
     **/
    public void minthreetoteama(View view) {
        scoreTeamA = scoreTeamA-3;
        displayForteama(scoreTeamA);
    }
    /**
     * Minus the score for Team B by 4
     **/
    public void minfourtoteama(View view) {
        scoreTeamA = scoreTeamA-4;
        displayForteama(scoreTeamA);
    }
    /**
     * Minus the score for Team B by 5
     **/
    public void minfivetoteama(View view) {
        scoreTeamA = scoreTeamA-5;
        displayForteama(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 1
     **/
    public void addonetoteamb(View view) {
        scoreTeamB=scoreTeamB+1;
        displayForteamb(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 2
     **/
    public void addtwototeamb(View view) {
        scoreTeamB=scoreTeamB+2;
        displayForteamb(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 3
     **/
    public void addthreetoteamb(View view) {

        scoreTeamB=scoreTeamB+3;
        displayForteamb(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 4
     **/
    public void addfourtoteamb(View view) {
        scoreTeamB=scoreTeamB+4;
        displayForteamb(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 5
     **/
    public void addfivetoteamb(View view) {
        scoreTeamB=scoreTeamB+5;
        displayForteamb(scoreTeamB);
    }
    /**
     * Minus the score for Team B by 1
     **/
    public void minonetoteamb(View view) {
        scoreTeamB=scoreTeamB-1;
        displayForteamb(scoreTeamB);
    }
    /**
     * Minus the score for Team B by 2
     **/
    public void mintwototeamb(View view) {
        scoreTeamB=scoreTeamB-2;
        displayForteamb(scoreTeamB);
    }
    /**
     * Minus the score for Team B by 3
     **/
    public void minthreetoteamb(View view) {
        scoreTeamB=scoreTeamB-3;
        displayForteamb(scoreTeamB);
    }
    /**
     * Minus the score for Team B by 4
     **/
    public void minfourtoteamab(View view) {
        scoreTeamB=scoreTeamB-4;
        displayForteamb(scoreTeamB);
    }
    /**
     * Minus the score for Team B by 5
     **/
    public void minfivetoteamb(View view) {
        scoreTeamB=scoreTeamB-5;
        displayForteamb(scoreTeamB);
    }
}
