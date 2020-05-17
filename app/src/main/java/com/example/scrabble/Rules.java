package com.example.scrabble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rules extends AppCompatActivity implements View.OnClickListener{
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        button=findViewById(R.id.button5);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent other = new Intent(this, MainActivity.class);
        startActivity(other);
    }
}
