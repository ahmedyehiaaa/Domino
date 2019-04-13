package com.example.ahmedyehia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThreePlayers extends AppCompatActivity {


    int scoreTeamA=0;
    int scoreTeamB=0;
    int scoreTeamC=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_players);
        displayForteama(0);
        displayForteamb(0);
        displayForteamc(0);
    }


    public void Resetthree(View view) {

        final Button buttonresetthree = (Button)findViewById(R.id.resetthree);
        buttonresetthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA=0;
                scoreTeamB=0;
                scoreTeamC=0;
                displayForteama(scoreTeamA);
                displayForteamb(scoreTeamB);
                displayForteamc(scoreTeamC);
            }
        });
    }

    public void displayForteama(int score){

        TextView scoreView = (TextView)findViewById(R.id.tteam_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForteamb(int score){

        TextView scoreView = (TextView)findViewById(R.id.tteam_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForteamc(int score){

        TextView scoreView = (TextView)findViewById(R.id.tteam_c_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase the score for Team B by 1
     **/
    public void addonetotteama(View view) {
        scoreTeamA = scoreTeamA+1;
        displayForteama(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 2
     **/
    public void addtwototteama(View view) {
        scoreTeamA = scoreTeamA+2;
        displayForteama(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 3
     **/
    public void addthreetotteama(View view) {
        scoreTeamA = scoreTeamA+3;
        displayForteama(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 4
     **/
    public void addfourtotteama(View view) {
        scoreTeamA = scoreTeamA+4;
        displayForteama(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 5
     **/
    public void addfivetotteama(View view) {

        scoreTeamA = scoreTeamA+5;
        displayForteama(scoreTeamA);
    }
    /**
     * Minus the score for Team B by 1
     **/
    public void minonetotteama(View view) {
        scoreTeamA = scoreTeamA-1;
        displayForteama(scoreTeamA);
    }
    /**
     * Minus the score for Team B by 2
     **/
    public void mintwototteama(View view) {
        scoreTeamA = scoreTeamA-2;
        displayForteama(scoreTeamA);
    }
    /**
     * Minus the score for Team B by 3
     **/
    public void minthreetotteama(View view) {
        scoreTeamA = scoreTeamA-3;
        displayForteama(scoreTeamA);
    }
    /**
     * Minus the score for Team B by 4
     **/
    public void minfourtotteama(View view) {
        scoreTeamA = scoreTeamA-4;
        displayForteama(scoreTeamA);
    }
    /**
     * Minus the score for Team B by 5
     **/
    public void minfivetotteama(View view) {
        scoreTeamA = scoreTeamA-5;
        displayForteama(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 1
     **/
    public void addonetotteamb(View view) {
        scoreTeamB=scoreTeamB+1;
        displayForteamb(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 2
     **/
    public void addtwototteamb(View view) {
        scoreTeamB=scoreTeamB+2;
        displayForteamb(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 3
     **/
    public void addthreetotteamb(View view) {

        scoreTeamB=scoreTeamB+3;
        displayForteamb(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 4
     **/
    public void addfourtotteamb(View view) {
        scoreTeamB=scoreTeamB+4;
        displayForteamb(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 5
     **/
    public void addfivetotteamb(View view) {
        scoreTeamB=scoreTeamB+5;
        displayForteamb(scoreTeamB);
    }
    /**
     * Minus the score for Team B by 1
     **/
    public void minonetotteamb(View view) {
        scoreTeamB=scoreTeamB-1;
        displayForteamb(scoreTeamB);
    }
    /**
     * Minus the score for Team B by 2
     **/
    public void mintwototteamb(View view) {
        scoreTeamB=scoreTeamB-2;
        displayForteamb(scoreTeamB);
    }
    /**
     * Minus the score for Team B by 3
     **/
    public void minthreetotteamb(View view) {
        scoreTeamB=scoreTeamB-3;
        displayForteamb(scoreTeamB);
    }
    /**
     * Minus the score for Team B by 4
     **/
    public void mintfourtotteamb(View view) {
        scoreTeamB=scoreTeamB-4;
        displayForteamb(scoreTeamB);
    }
    /**
     * Minus the score for Team B by 5
     **/
    public void minfivetotteamb(View view) {
        scoreTeamB=scoreTeamB-5;
        displayForteamb(scoreTeamB);
    }
    /**
     * Increase the score for Team C by 1
     **/
    public void addonetotteamc(View view) {
        scoreTeamC=scoreTeamC+1;
        displayForteamc(scoreTeamC);
    }
    /**
     * Increase the score for Team C by 2
     **/
    public void addtwototteamc(View view) {
        scoreTeamC=scoreTeamC+2;
        displayForteamc(scoreTeamC);
    }
    /**
     * Increase the score for Team C by 3
     **/
    public void addthreetotteamc(View view) {
        scoreTeamC=scoreTeamC+3;
        displayForteamc(scoreTeamC);
    }
    /**
     * Increase the score for Team C by 4
     **/
    public void addfourtotteamc(View view) {
        scoreTeamC=scoreTeamC+4;
        displayForteamc(scoreTeamC);
    }
    /**
     * Increase the score for Team C by 5
     **/
    public void addfivetotteamc(View view) {
        scoreTeamC=scoreTeamC+5;
        displayForteamc(scoreTeamC);
    }
    /**
     * Minus the score for Team C by 1
     **/
    public void minonetotteamc(View view) {
        scoreTeamC=scoreTeamC-1;
        displayForteamc(scoreTeamC);
    }
    /**
     * Minus the score for Team C by 2
     **/
    public void mintwototteamc(View view) {
        scoreTeamC=scoreTeamC-2;
        displayForteamc(scoreTeamC);
    }
    /**
     * Minus the score for Team C by 3
     **/
    public void minthreetotteamc(View view) {
        scoreTeamC=scoreTeamC-3;
        displayForteamc(scoreTeamC);
    }
    /**
     * Minus the score for Team C by 4
     **/
    public void minfourtotteamc(View view) {
        scoreTeamC=scoreTeamC-4;
        displayForteamc(scoreTeamC);
    }
    /**
     * Minus the score for Team C by 5
     **/
    public void minfivetotteamc(View view) {
        scoreTeamC=scoreTeamC-5;
        displayForteamc(scoreTeamC);
    }

}
