package com.example.mysqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        textView=findViewById (R.id.textview);

        textView.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i =new Intent (getApplicationContext (),Sign_up.class);
                startActivity (i);
            }
        });
    }
}
