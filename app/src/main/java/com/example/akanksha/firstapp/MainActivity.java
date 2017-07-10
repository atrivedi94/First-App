package com.example.akanksha.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends Activity
{

    private ToggleButton myToggleButton;
    private TextView response;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView newGame = (TextView) findViewById(R.id.newGame_button) ;
        TextView settings = (TextView) findViewById(R.id.settings_button);
        TextView howTo = (TextView) findViewById(R.id.howTo_button);

        newGame.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent newGameIntent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(newGameIntent);
            }
        });

        settings.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });

        howTo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent howToIntent = new Intent(MainActivity.this, HowToActivity.class);
                startActivity(howToIntent);
            }
        });
    }
}
