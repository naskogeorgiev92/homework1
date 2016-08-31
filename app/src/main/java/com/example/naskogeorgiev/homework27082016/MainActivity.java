package com.example.naskogeorgiev.homework27082016;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.buttonExercise1);
        button2 = (Button) findViewById(R.id.buttonExercise2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonExercise1) {
            startActivity(new Intent(MainActivity.this, Exercise1.class));
        }
        if(v.getId() == R.id.buttonExercise2) {
            startActivity(new Intent(MainActivity.this, Exercise2.class));
        }
    }
}
