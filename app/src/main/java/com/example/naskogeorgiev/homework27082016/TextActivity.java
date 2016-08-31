package com.example.naskogeorgiev.homework27082016;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TextActivity extends Activity {

    TextView tvId, tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        tvId = (TextView) findViewById(R.id.textView_id);
        tvName = (TextView) findViewById(R.id.textView_name);

        Intent intent = getIntent();
        tvId.setText(String.valueOf(intent.getIntExtra("COMPONENT_ID", -1)));
        tvName.setText(intent.getStringExtra("COMPONENT_NAME"));
    }
}
