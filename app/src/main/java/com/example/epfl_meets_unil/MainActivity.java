package com.example.epfl_meets_unil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void greet(View view){
        Intent intent = new Intent(this, GreetingScreen.class);
        intent.putExtra("name", ((TextView)findViewById(R.id.mainName)).getText().toString());
        startActivity(intent);


    }
}