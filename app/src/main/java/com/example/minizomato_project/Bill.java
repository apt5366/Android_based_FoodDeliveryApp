package com.example.minizomato_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bill extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        textView=findViewById(R.id.textView);
        Bundle bundle= getIntent().getExtras();
        String s=bundle.getString("message");
        textView.setText(s);


    }
}
