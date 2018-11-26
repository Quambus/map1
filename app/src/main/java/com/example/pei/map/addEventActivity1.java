package com.example.pei.map;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class addEventActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event1);
    }

    public void createEvent(View view)
    {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
