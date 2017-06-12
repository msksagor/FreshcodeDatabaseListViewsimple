package com.example.fondn.customlistviewdatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editTextID);
        button = (Button) findViewById(R.id.sendID);

        final DatabaseClass databaseClass = new DatabaseClass(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names = editText.getText().toString();
                databaseClass.add(new Store(names));
                Intent i = new Intent(MainActivity.this,Result.class);
                startActivity(i);
            }
        });
    }
}
