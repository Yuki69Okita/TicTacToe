package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button tBtn;
    private Button pBtn;
    private Button sBtn;
    private Button lBtn;


    TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello = findViewById(R.id.helloTV);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            hello.setText("Hello again!");
        }

        tBtn = findViewById(R.id.tutorialBtn);
        tBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTutorial();
            }
        });

        pBtn = findViewById(R.id.playBtn);
        pBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayActivity();
            }
        });

        sBtn = findViewById(R.id.singInBtn);
        sBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSingIn();
            }
        });

        lBtn = findViewById(R.id.logoutBtn);
        lBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
    }

    public void openTutorial(){
        Intent intent = new Intent(this, Tutorial.class);
        startActivity(intent);
    }

    public void openPlayActivity(){
        Intent intent = new Intent(this, Play.class);
        startActivity(intent);
    }

    public void openSingIn(){
        Intent intent = new Intent(this, SingIn_Login.class);
        startActivity(intent);
    }

    public void openProfile(){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}
