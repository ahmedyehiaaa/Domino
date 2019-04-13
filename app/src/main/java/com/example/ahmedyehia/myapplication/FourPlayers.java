package com.example.ahmedyehia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FourPlayers extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int scoreTeamC = 0;
    int scoreTeamD = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_players);
        displayForteama(0);
        displayForteamb(0);
        displayForteamc(0);
        displayForteamd(0);
    }


    public void Resetfour(View view) {

        final Button buttonresetfour = (Button)findViewById(R.id.resetfour);
        buttonresetfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA=0;
                scoreTeamB=0;
                scoreTeamC=0;
                scoreTeamD=0;
                displayForteama(scoreTeamA);
                displayForteamb(scoreTeamB);
                displayForteamc(scoreTeamC);
                displayForteamd(scoreTeamD);
            }
        });
    }

    public void displayForteama(int score){

        TextView scoreView = (TextView)findViewById(R.id.fteam_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForteamb(int score){

        TextView scoreView = (TextView)findViewById(R.id.fteam_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForteamc(int score){

        TextView scoreView = (TextView)findViewById(R.id.fteam_c_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForteamd(int score){

        TextView scoreView = (TextView)findViewById(R.id.fteam_d_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase the score for Team B by 1
     **/
    public void addonetofteama(View view) {
        scoreTeamA = scoreTeamA+1;
        displayForteama(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 2
     **/
    public void addtwotofteama(View view) {
        scoreTeamA = scoreTeamA+2;
        displayForteama(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 3
     **/
    public void addthreetofteama(View view) {
        scoreTeamA = scoreTeamA+3;
        displayForteama(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 4
     **/
    public void addfourtofteama(View view) {
        scoreTeamA = scoreTeamA+4;
        displayForteama(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 5
     **/
    public void addfivetofteama(View view) {

        scoreTeamA = scoreTeamA+5;
        displayForteama(scoreTeamA);
    }
    /**
     * Minus the score for Team B by 1
     **/
    public void minonetofteama(View view) {
        scoreTeamA = scoreTeamA-1;
        displayForteama(scoreTeamA);
    }
    /**
     * Minus the score for Team B by 2
     **/
    public void mintwotofteama(View view) {
        scoreTeamA = scoreTeamA-2;
        displayForteama(scoreTeamA);
    }
    /**
     * Minus the score for Team B by 3
     **/
    public void minthreetofteama(View view) {
        scoreTeamA = scoreTeamA-3;
        displayForteama(scoreTeamA);
    }
    /**
     * Minus the score for Team B by 4
     **/
    public void minfourtofteama(View view) {
        scoreTeamA = scoreTeamA-4;
        displayForteama(scoreTeamA);
    }
    /**
     * Minus the score for Team B by 5
     **/
    public void minfivetofteama(View view) {
        scoreTeamA = scoreTeamA-5;
        displayForteama(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 1
     **/
    public void addonetofteamb(View view) {
        scoreTeamB=scoreTeamB+1;
        displayForteamb(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 2
     **/
    public void addtwotofteamb(View view) {
        scoreTeamB=scoreTeamB+2;
        displayForteamb(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 3
     **/
    public void addthreetofteamb(View view) {

        scoreTeamB=scoreTeamB+3;
        displayForteamb(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 4
     **/
    public void addfourtofteamb(View view) {
        scoreTeamB=scoreTeamB+4;
        displayForteamb(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 5
     **/
    public void addfivetofteamb(View view) {
        scoreTeamB=scoreTeamB+5;
        displayForteamb(scoreTeamB);
    }
    /**
     * Minus the score for Team B by 1
     **/
    public void minonetofteamb(View view) {
        scoreTeamB=scoreTeamB-1;
        displayForteamb(scoreTeamB);
    }
    /**
     * Minus the score for Team B by 2
     **/
    public void mintwotofteamb(View view) {
        scoreTeamB=scoreTeamB-2;
        displayForteamb(scoreTeamB);
    }
    /**
     * Minus the score for Team B by 3
     **/
    public void minthreetofteamb(View view) {
        scoreTeamB=scoreTeamB-3;
        displayForteamb(scoreTeamB);
    }
    /**
     * Minus the score for Team B by 4
     **/
    public void minfourtofteamb(View view) {
        scoreTeamB=scoreTeamB-4;
        displayForteamb(scoreTeamB);
    }
    /**
     * Minus the score for Team B by 5
     **/
    public void minfivetofteamb(View view) {
        scoreTeamB=scoreTeamB-5;
        displayForteamb(scoreTeamB);
    }
    /**
     * Increase the score for Team C by 1
     **/
    public void addonetofteamc(View view) {
        scoreTeamC=scoreTeamC+1;
        displayForteamc(scoreTeamC);
    }
    /**
     * Increase the score for Team C by 2
     **/
    public void addtwotofteamc(View view) {
        scoreTeamC=scoreTeamC+2;
        displayForteamc(scoreTeamC);
    }
    /**
     * Increase the score for Team C by 3
     **/
    public void addthreetofteamc(View view) {
        scoreTeamC=scoreTeamC+3;
        displayForteamc(scoreTeamC);
    }
    /**
     * Increase the score for Team C by 4
     **/
    public void addfourtofteamc(View view) {
        scoreTeamC=scoreTeamC+4;
        displayForteamc(scoreTeamC);
    }
    /**
     * Increase the score for Team C by 5
     **/
    public void addfivetofteamc(View view) {
        scoreTeamC=scoreTeamC+5;
        displayForteamc(scoreTeamC);
    }
    /**
     * Minus the score for Team C by 1
     **/
    public void minonetofteamc(View view) {
        scoreTeamC=scoreTeamC-1;
        displayForteamc(scoreTeamC);
    }
    /**
     * Minus the score for Team C by 2
     **/
    public void mintwotofteamc(View view) {
        scoreTeamC=scoreTeamC-2;
        displayForteamc(scoreTeamC);
    }
    /**
     * Minus the score for Team C by 3
     **/
    public void minthreetofteamc(View view) {
        scoreTeamC=scoreTeamC-3;
        displayForteamc(scoreTeamC);
    }
    /**
     * Minus the score for Team C by 4
     **/
    public void minfourtofteamc(View view) {
        scoreTeamC=scoreTeamC-4;
        displayForteamc(scoreTeamC);
    }
    /**
     * Minus the score for Team C by 5
     **/
    public void minfivetofteamc(View view) {
        scoreTeamC=scoreTeamC-5;
        displayForteamc(scoreTeamC);
    }
    /**
     * Increase the score for Team D by 1
     **/
    public void addonetofteamd(View view) {
        scoreTeamD=scoreTeamD+1;
        displayForteamd(scoreTeamD);
    }
    /**
     * Increase the score for Team D by 2
     **/
    public void addtwotofteamd(View view) {
        scoreTeamD=scoreTeamD+2;
        displayForteamd(scoreTeamD);
    }
    /**
     * Increase the score for Team D by 3
     **/
    public void addthreetofteamd(View view) {
        scoreTeamD=scoreTeamD+3;
        displayForteamd(scoreTeamD);
    }
    /**
     * Increase the score for Team D by 4
     **/
    public void addfourtofteamd(View view) {
        scoreTeamD=scoreTeamD+4;
        displayForteamd(scoreTeamD);
    }
    /**
     * Increase the score for Team D by 5
     **/
    public void addfivetofteamd(View view) {
        scoreTeamD=scoreTeamD+5;
        displayForteamd(scoreTeamD);
    }
    /**
     * Minus the score for Team D by 1
     **/
    public void minonetofteamd(View view) {
        scoreTeamD=scoreTeamD-1;
        displayForteamd(scoreTeamD);
    }
    /**
     * Minus the score for Team D by 2
     **/
    public void mintwotofteamd(View view) {
        scoreTeamD=scoreTeamD-2;
        displayForteamd(scoreTeamD);
    }
    /**
     * Minus the score for Team D by 3
     **/
    public void minthreetofteamd(View view) {
        scoreTeamD=scoreTeamD-3;
        displayForteamd(scoreTeamD);
    }
    /**
     * Minus the score for Team D by 4
     **/
    public void minfourtofteamd(View view) {
        scoreTeamD=scoreTeamD-4;
        displayForteamd(scoreTeamD);
    }
    /**
     * Minus the score for Team D by 5
     **/
    public void minfivetofteamd(View view) {
        scoreTeamD=scoreTeamD-5;
        displayForteamd(scoreTeamD);
    }

}
