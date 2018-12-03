package com.example.pei.map;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class viewEventActivity extends AppCompatActivity {

    ListView listView;

    public static String EventName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_event);

        listView = (ListView) findViewById(R.id.EventListView);

        final ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello Qian^2");
        arrayList.add("Hello Alex Master");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(viewEventActivity.this, clickEventActivity.class);

                EventName = arrayList.get(position);
                intent.putExtra("EVENT_NAME",EventName);

                startActivity(intent);
            }
        });
    }

}
