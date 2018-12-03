package com.example.pei.map;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class clickEventActivity extends AppCompatActivity {

    private TextView temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_event);

        temp = (TextView) findViewById(R.id.textView5);
        temp.setText(getIntent().getExtras().getString("EVENT_NAME"));

    }
}
