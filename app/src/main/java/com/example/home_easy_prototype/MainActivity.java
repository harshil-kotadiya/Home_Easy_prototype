package com.example.home_easy_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button plumber, mechanic,guard,house_keeper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plumber = findViewById(R.id.plumber);
        mechanic = findViewById(R.id.mechanic);
        guard = findViewById(R.id.Guard);
        house_keeper = findViewById(R.id.house_keeper);

        plumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,plumber.class);
                startActivity(i);
            }
        });

        mechanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,mechanic.class);
                startActivity(i);
            }
        });

        guard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Guard.class);
                startActivity(i);
            }
        });

        house_keeper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,housekeeper.class);
                startActivity(i);
            }
        });

    }
}