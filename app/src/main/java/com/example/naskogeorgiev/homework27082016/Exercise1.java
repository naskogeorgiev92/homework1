package com.example.naskogeorgiev.homework27082016;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exercise1 extends Activity implements View.OnClickListener {

    int count1, count2;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);

        button1 = (Button) findViewById(R.id.buttonCount1);
        button2 = (Button) findViewById(R.id.buttonCount2);

        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonCount1) {
            count1++;
            button1.setText(String.valueOf(count1));
        }
    }

    public void onClickButtonCount2(View view) {
        count2++;
        button2.setText(String.valueOf(count2));
    }
}
