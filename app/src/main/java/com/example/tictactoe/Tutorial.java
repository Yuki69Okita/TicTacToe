package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tutorial extends AppCompatActivity {

    private Button sBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        sBtn = findViewById(R.id.getStartedBtn);
        sBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSingIn();
            }
        });
    }

    public void openSingIn(){
        Intent intent = new Intent(this, SingIn_Login.class);
        startActivity(intent);
    }
}
