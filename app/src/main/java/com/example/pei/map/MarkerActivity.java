package com.example.pei.map;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MarkerActivity extends AppCompatActivity {

    private TextView temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marker);

        temp = (TextView) findViewById(R.id.textView3);

        temp.setText(getIntent().getExtras().getString("PASS_NAME"));

    }


}
