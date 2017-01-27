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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayPlayer1Life(Player1Life);
        displayPlayer2Life(Player1Life);
        displayPlayer1Poison(Player1Poison);
        displayPlayer2Poison(Player2Poison);
    }
    /**
     * Add life to player 1
     */
    public void addLifeToPlayer1 (View v) {
        Player1Life = Player1Life + 1;
        displayPlayer1Life(Player1Life);
    }
    /**
     * Remove life from player 1
     */
    public void removeLifeFromPlayer1 (View v) {
        Player1Life = Player1Life - 1;
        displayPlayer1Life(Player1Life);
    }
    /**
     * Add life to player 2
     */
    public void addLifeToPlayer2 (View v) {
        Player2Life = Player2Life + 1;
        displayPlayer2Life(Player2Life);
    }
    /**
     * Remove life from player 2
     */
    public void removeLifeFromPlayer2 (View v) {
        Player2Life = Player2Life - 1;
        displayPlayer2Life(Player2Life);
    }
    /**
     * Add poison to player 1
     */
    public void addPoisonToPlayer1 (View v) {
        Player1Poison = Player1Poison + 1;
        displayPlayer1Poison(Player1Poison);
    }
    /**
     * Remove poison from player 1
     */
    public void removePoisonFromPlayer1 (View v) {
        Player1Poison = Player1Poison - 1;
        displayPlayer1Poison(Player1Poison);
    }
    /**
     * Add poison to player 2
     */
    public void addPoisonToPlayer2 (View v) {
        Player2Poison = Player2Poison + 1;
        displayPlayer2Poison(Player2Poison);
    }
    /**
     * Remove poison from player 2
     */
    public void removePoisonFromPlayer2 (View v) {
        Player2Poison = Player2Poison - 1;
        displayPlayer2Poison(Player2Poison);
    }
    /**
     * Reset life and poison
     */
    public void resetLife (View v) {
        Player1Life = 20;
        Player2Life = 20;
        Player1Poison = 0;
        Player2Poison = 0;
        displayPlayer1Life(Player1Life);
        displayPlayer2Life(Player1Life);
        displayPlayer1Poison(Player1Poison);
        displayPlayer2Poison(Player2Poison);
    }
    /**
     * Displays the given life of player 1
     */
    public void displayPlayer1Life(int life) {
        TextView lifeView = (TextView) findViewById(R.id.Player1Life);
        lifeView.setText(String.valueOf(life));
    }
    /**
     * Displays the given poison of player 1
     */
    public void displayPlayer1Poison(int poison) {
        TextView PoisonView = (TextView) findViewById(R.id.Player1Poison);
        PoisonView.setText(String.valueOf(poison));
    }
    /**
     * Displays the given life of player 2
     */
    public void displayPlayer2Life(int life) {
        TextView lifeView = (TextView) findViewById(R.id.Player2Life);
        lifeView.setText(String.valueOf(life));
    }
    /**
     * Displays the given poison of player 2
     */
    public void displayPlayer2Poison(int poison) {
        TextView PoisonView = (TextView) findViewById(R.id.Player2Poison);
        PoisonView.setText(String.valueOf(poison));
    }
}
