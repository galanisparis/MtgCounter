package com.example.android.mtgcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int Player1Poison = 0;
    int Player2Poison = 0;
    int Player1Life = 20;
    int Player2Life = 20;
    TextView PoisonView1;
    TextView PoisonView2;
    TextView LifeView1;
    TextView LifeView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PoisonView1 = (TextView) findViewById(R.id.Player1Poison);
        PoisonView2 = (TextView) findViewById(R.id.Player2Poison);
        LifeView1 = (TextView) findViewById(R.id.Player1Life);
        LifeView2 = (TextView) findViewById(R.id.Player2Life);
        displayLife(LifeView1, Player1Life);
        displayLife(LifeView2, Player2Life);
        displayPoison(PoisonView1, Player1Poison);
        displayPoison(PoisonView2, Player2Poison);
        displayLife(LifeView1, Player1Life);
        displayLife(LifeView2, Player2Life);
    }

    /**
     * Add life to player 1
     */
    public void addLifeToPlayer1(View v) {
        Player1Life = Player1Life + 1;
        displayLife(LifeView1, Player1Life);
    }

    /**
     * Remove life from player 1
     */
    public void removeLifeFromPlayer1(View v) {
        Player1Life = Player1Life - 1;
        displayLife(LifeView1, Player1Life);
    }

    /**
     * Add life to player 2
     */
    public void addLifeToPlayer2(View v) {
        Player2Life = Player2Life + 1;
        displayLife(LifeView2, Player2Life);
    }

    /**
     * Remove life from player 2
     */
    public void removeLifeFromPlayer2(View v) {
        Player2Life = Player2Life - 1;
        displayLife(LifeView2, Player2Life);
    }

    /**
     * Add poison to player 1
     */
    public void addPoisonToPlayer1(View v) {
        Player1Poison = Player1Poison + 1;
        displayPoison(PoisonView1, Player1Poison);
    }

    /**
     * Remove poison from player 1
     */
    public void removePoisonFromPlayer1(View v) {
        Player1Poison = Player1Poison - 1;
        displayPoison(PoisonView1, Player1Poison);
    }

    /**
     * Add poison to player 2
     */
    public void addPoisonToPlayer2(View v) {
        Player2Poison = Player2Poison + 1;
        displayPoison(PoisonView2, Player2Poison);
    }

    /**
     * Remove poison from player 2
     */
    public void removePoisonFromPlayer2(View v) {
        Player2Poison = Player2Poison - 1;
        displayPoison(PoisonView2, Player2Poison);
    }

    /**
     * Reset life and poison
     */
    public void resetLife(View v) {
        Player1Life = 20;
        Player2Life = 20;
        Player1Poison = 0;
        Player2Poison = 0;
        displayLife(LifeView2, Player2Life);
        displayLife(LifeView2, Player2Life);
        displayPoison(PoisonView1, Player1Poison);
        displayPoison(PoisonView2, Player2Poison);
    }

    /**
     * Displays the life
     */
    public void displayLife(TextView lifeView, int life) {
        lifeView.setText(String.valueOf(life));
    }

    /**
     * Displays the poison
     */
    public void displayPoison(TextView poisonView, int poison) {
        poisonView.setText(String.valueOf(poison));
    }
}
