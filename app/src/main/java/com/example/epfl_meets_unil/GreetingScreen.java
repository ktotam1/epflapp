package com.example.epfl_meets_unil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GreetingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting_screen);
        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            String name = (String)extras.get("name");
            ((TextView) findViewById(R.id.greetingMessage)).setText("Hello, " + name);
        } else {
            ((TextView) findViewById(R.id.greetingMessage)).setText("Failed to find extras");
        }
    }
}