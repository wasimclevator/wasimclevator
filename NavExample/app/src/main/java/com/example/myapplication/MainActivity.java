package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavHostFragment navHostFragment= (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        findViewById(R.id.button).setOnClickListener(view -> {
            if (counter>1) {
                counter=0;
            }
            if (counter==0) {
                BlankFragment1Directions.ActionBlankFragment1ToBlankFragment2 action=BlankFragment1Directions.actionBlankFragment1ToBlankFragment2("Ronald");
                navHostFragment.getNavController().navigate(action);
            }
            else if (counter==1) {
                navHostFragment.getNavController().navigate(R.id.blankFragment3);
            }

            counter++;
        });

    }
}