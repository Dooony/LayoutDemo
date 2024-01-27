package edu.northeastern.layoutdemos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initializeAbsoluteLayoutView();
        initializeLinearLayoutView();
        initializeRelativeLayoutView();
        initializeTableView();
        initializeNestedView();
    }
    private void initializeAbsoluteLayoutView() {

        Button linearLayoutButton = findViewById(R.id.absolusteLayoutButton);
        linearLayoutButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AbsoluteLayout.class);
            startActivity(intent);
        });
    }
    private void initializeLinearLayoutView() {

        Button linearLayoutButton = findViewById(R.id.linearLayoutButton);
        linearLayoutButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, LinearLayout.class);
            startActivity(intent);
        });
    }

    private void initializeRelativeLayoutView() {

        Button linearLayoutButton = findViewById(R.id.relativeLayoutButton);
        linearLayoutButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RelativeLayout.class);
            startActivity(intent);
        });
    }

    private void initializeTableView() {

        Button linearLayoutButton = findViewById(R.id.tableLayoutButton);
        linearLayoutButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RelativeLayout.class);
            startActivity(intent);
        });
    }

    private void initializeNestedView() {

        Button linearLayoutButton = findViewById(R.id.nestedLayoutButton);
        linearLayoutButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, NestedView.class);
            startActivity(intent);
        });
    }
}