package com.example.naskogeorgiev.homework27082016;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Exercise2 extends Activity implements View.OnClickListener{

    TextView tvState;
    Button btnCalifornia, btnOhio, btnTexas;
    int lastClickedId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);

        tvState = (TextView) findViewById(R.id.textView_state);
        btnCalifornia = (Button) findViewById(R.id.button_california);
        btnOhio = (Button) findViewById(R.id.button_ohio);
        btnTexas = (Button) findViewById(R.id.button_texas);

        tvState.setOnClickListener(this);
        btnCalifornia.setOnClickListener(this);
        btnOhio.setOnClickListener(this);
        btnTexas.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button_california) {
            if(checkForLastClicked(R.id.button_california)) {
                tvState.setText(R.string.california);
            } else {
                tvState.setText(R.string.button_california_id);
            }
            lastClickedId = R.id.button_california;
        }
        if(v.getId() ==  R.id.button_ohio) {
            if(checkForLastClicked(R.id.button_ohio)) {
                tvState.setText(R.string.ohio);
            } else {
                tvState.setText(R.string.button_ohio_id);
            }
            lastClickedId = R.id.button_ohio;
        }
        if(v.getId() == R.id.button_texas) {
            if(checkForLastClicked(R.id.button_texas)) {
                tvState.setText(R.string.texas);
            } else {
                tvState.setText(R.string.button_texas_id);
            }
            lastClickedId = R.id.button_texas;
        }

        if(v.getId() == R.id.textView_state) {

            // It wasn't clear what does component name means. I'm sending the current text.
            // On textView click when item was selected open a new activity and inside of it show component ID and name

            Intent intent = new Intent(Exercise2.this, TextActivity.class);
            intent.putExtra("COMPONENT_ID", R.id.textView_state);
            intent.putExtra("COMPONENT_NAME", tvState.getText().toString());
            startActivity(intent);
        }
    }

    private boolean checkForLastClicked(int id) {
        return id == lastClickedId;
    }
}
