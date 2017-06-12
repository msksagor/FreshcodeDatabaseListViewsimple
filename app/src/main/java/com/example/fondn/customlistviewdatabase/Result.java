package com.example.fondn.customlistviewdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Result extends AppCompatActivity {
    ListView listView;
    CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        listView = (ListView) findViewById(R.id.listID);
        DatabaseClass databaseClass = new DatabaseClass(this);
        customAdapter = new CustomAdapter(getApplicationContext(), (ArrayList<Store>) databaseClass.getAllContacts());
       // customAdapter = new CustomAdapter(getApplicationContext(),db.getData());
        listView.setAdapter(customAdapter);

    }
}
