package com.example.pei.map;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void SubmitLogin(View view)
    {
        Intent intent = new Intent(this, addEventActivity1.class);
        startActivity(intent);
    }

}
