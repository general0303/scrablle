package com.example.scrabble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn2, btn3, btn4, btnc, rul;
    public int m=0;
    public boolean flag=false;
    public boolean flag1=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btnc=findViewById(R.id.buttonc);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btnc.setOnClickListener(this);
        rul=findViewById(R.id.rules);
        rul.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2: { m=2; break;}
            case R.id.button3: { m=3; break;}
            case R.id.button4: { m=4; break;}
            case R.id.buttonc: { m=2; flag=true; break;}
            case R.id.rules: {flag1=true; break;}
        }
        Intent other;
        if (flag1) other = new Intent(this, Rules.class);
        else {
            if (!flag) {
                game.setm(m);
                other = new Intent(this, game.class);
            } else {
                computergame.setm(m);
                other = new Intent(this, computergame.class);
            }
        }
        startActivity(other);
    }
}
