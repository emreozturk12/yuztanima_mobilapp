package com.example.deneme3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button_send);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent myIntent= new Intent(MainActivity.this, KameraActivity.class);
                startActivity(myIntent);
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent myIntent= new Intent(MainActivity.this, KameraActivity.class);
        startActivity(myIntent);
    }
}


